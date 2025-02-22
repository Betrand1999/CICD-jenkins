cat << 'EOF' > my-maven-app/src/main/java/com/example/App.java
package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World from Jenkins CI/CD!");
    }
}
EOF
