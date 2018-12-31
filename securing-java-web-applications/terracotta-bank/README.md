# terracotta-bank
A darned-vulnerable Java web application - For educating on and practicing secure Java coding techniques

## Find Security Bugs

We have enabled the [findsecbugs maven plugin](https://spotbugs.readthedocs.io/en/stable/maven.html).
To see it in action you can run:

* `mvn spotbugs:check` to fail the build on errors and get the output to the console like below.

```
[INFO] --- spotbugs-maven-plugin:3.1.10:check (default-cli) @ terracotta-bank ---
[INFO] BugInstance size is 33
[INFO] Error size is 0
[INFO] Total bugs: 33
[ERROR] Found reliance on default encoding in com.joshcummings.codeplay.terracotta.app.DatabaseConfigurer.contextInitialized(ServletContextEvent): new java.io.InputStreamReader(InputStream) [com.joshcummings.codeplay.terracotta.app.DatabaseConfigurer] At DatabaseConfigurer.java:[line 43] DM_DEFAULT_ENCODING
[ERROR] This use of java/sql/Connection.prepareStatement(Ljava/lang/String;)Ljava/sql/PreparedStatement; can be vulnerable to SQL injection [com.joshcummings.codeplay.terracotta.app.DatabaseConfigurer, com.joshcummings.codeplay.terracotta.app.DatabaseConfigurer] At DatabaseConfigurer.java:[line 47]At DatabaseConfigurer.java:[line 45] SQL_INJECTION_JDBC
[ERROR] Cookie without the secure flag could be sent in clear text if a HTTP URL is visited [com.joshcummings.codeplay.terracotta.defense.http.CookieBasedCsrfTokenRepository] At CookieBasedCsrfTokenRepository.java:[line 38] INSECURE_COOKIE
[ERROR] Found reliance on default encoding in com.joshcummings.codeplay.terracotta.defense.http.SafeEncodedHeadersFilter$SafeEncodedHeadersHttpServletResponseWrapper.prepareHeaderValue(String): new String(byte[]) [com.joshcummings.codeplay.terracotta.defense.http.SafeEncodedHeadersFilter$SafeEncodedHeadersHttpServletResponseWrapper] At SafeEncodedHeadersFilter.java:[line 65] DM_DEFAULT_ENCODING
. . .
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 10.704 s
[INFO] Finished at: 2019-01-28T22:14:35+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal com.github.spotbugs:spotbugs-maven-plugin:3.1.10:check (default-cli) on project terracotta-bank: failed with 33 bugs and 0 errors  -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
```

* `mvn spotbugs:gui` to see the output on a Java desktop UI
* `mvn site` to generate an HTML report as part of your site documentation.
