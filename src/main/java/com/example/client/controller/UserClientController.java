package com.example.client.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserClientController {

    @RequestMapping("/secureHome")
    public String secondHome(Principal user) {
        StringBuffer page = new StringBuffer();
        page.append("<!doctype html>\n" + "<html lang=\"en\">\n" + "\n"
                + "<head>\n" + "  <meta charset=\"utf-8\">\n"
                + "  <title>Spring Boot OAuth2 Client</title>\n"
                + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                + "  <style type=\"text/css\">\n" + "    body,\n"
                + "    html {\n" + "      height: 100%;\n"
                + "      padding: 0px;\n" + "      margin: 0px;\n"
                + "      overflow: hidden;\n" + "    }\n" + "\n"
                + "  </style>\n" + "</head>\n" + "\n" + "<body>\n" + "<div>\n"
                + "You have successfully launched!" + "<br>"
                + "Authentication user profile: " + user.getName() + "<br>"
                + "</div>\n" + "</body>\n" + "\n" + "</html>");
        return page.toString();
    }

}
