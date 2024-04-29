// LoggingFilter.java
package com.example.bankingappd15cw4.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;

@Component
public class AbiLoggingFilter extends OncePerRequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(AbiLoggingFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        long startTime = System.currentTimeMillis();

        // Process request
        filterChain.doFilter(request, response);

        // Log request and response details
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String payload = request.getReader().lines().reduce("", (accumulator, actual) -> accumulator + actual);
        int responseCode = response.getStatus();
        String responseBody = response.getContentType();
        long processingTime = System.currentTimeMillis() - startTime;

        logger.info("FINISHED PROCESSING : METHOD={}; REQUESTURI={}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                method, uri, payload, responseCode, responseBody, processingTime);
    }
}
