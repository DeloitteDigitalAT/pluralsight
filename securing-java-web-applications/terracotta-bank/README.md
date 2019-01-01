# terracotta-bank
A darned-vulnerable Java web application - For educating on and practicing secure Java coding techniques


## OWASP Dependency Checker

We have enabled the [OWASP Dependency Checker maven plugin](https://jeremylong.github.io/DependencyCheck/dependency-check-maven/index.html).
To see it in action you can run:

* `mvn verify -DskipTests=true` to run the checker analysis in your CI pipeline.

You will then be able to see the output below in the console:

```
[INFO] --- dependency-check-maven:4.0.2:check (default) @ terracotta-bank ---
[INFO] Central analyzer disabled
[INFO] Checking for updates
[INFO] Skipping NVD check since last check was within 4 hours.
[INFO] Skipping RetireJS update since last update was within 24 hours.
[INFO] Check for updates complete (16 ms)
[INFO] Analysis Started
[INFO] Finished Archive Analyzer (2 seconds)
[INFO] Finished File Name Analyzer (0 seconds)
[INFO] Finished Jar Analyzer (1 seconds)
[ERROR] ----------------------------------------------------
[ERROR] .NET Assembly Analyzer could not be initialized and at least one 'exe' or 'dll' was scanned. The 'mono' executable could not be found on the path; either disable the Assembly Analyzer or configure the path mono. On some systems mono-runtime and mono-devel need to be installed.
[ERROR] ----------------------------------------------------
[INFO] Finished Dependency Merging Analyzer (0 seconds)
[INFO] Finished Version Filter Analyzer (0 seconds)
[INFO] Finished Hint Analyzer (0 seconds)
[INFO] Created CPE Index (1 seconds)
[INFO] Skipping CPE Analysis for npm
[INFO] Finished CPE Analyzer (2 seconds)
[INFO] Finished False Positive Analyzer (0 seconds)
[INFO] Finished NVD CVE Analyzer (0 seconds)
[INFO] Finished Vulnerability Suppression Analyzer (0 seconds)
[INFO] Finished Dependency Bundling Analyzer (0 seconds)
[INFO] Analysis Complete (7 seconds)
[WARNING]

One or more dependencies were identified with known vulnerabilities in Terracotta Bank Web Application:

esapi-2.1.0.jar (org.owasp.esapi:esapi:2.1.0, cpe:/a:owasp:enterprise_security_api:2.1.0) : CVE-2013-5960
commons-beanutils-1.7.0.jar (commons-beanutils:commons-beanutils:1.7.0, cpe:/a:apache:commons_beanutils:1.7.0) : CVE-2014-0114
commons-beanutils-core-1.7.0.jar (cpe:/a:apache:commons_beanutils:1.7.0, commons-beanutils:commons-beanutils-core:1.7.0) : CVE-2014-0114
commons-fileupload-1.2.jar (cpe:/a:apache:commons_fileupload:1.2, commons-fileupload:commons-fileupload:1.2) : CVE-2014-0050, CVE-2016-1000031, CVE-2013-0248, CVE-2016-3092
commons-collections-3.2.jar (commons-collections:commons-collections:3.2, cpe:/a:apache:commons_collections:3.2.1) : CVE-2015-6420, CVE-2017-15708
xercesImpl-2.8.0.jar (xerces:xercesImpl:2.8.0, cpe:/a:apache:xerces2_java:2.8.0) : CVE-2012-0881
xalan-2.7.0.jar (xalan:xalan:2.7.0, cpe:/a:apache:xalan-java:2.7.0) : CVE-2014-0107
bsh-core-2.0b4.jar (org.beanshell:bsh-core:2.0b4, cpe:/a:beanshell_project:beanshell:2.0.b4) : CVE-2016-2510
antisamy-1.4.3.jar (cpe:/a:antisamy_project:antisamy:1.4.3, org.owasp.antisamy:antisamy:1.4.3) : CVE-2018-1000643, CVE-2017-14735, CVE-2016-10006
batik-css-1.7.jar (cpe:/a:apache:batik:1.7, org.apache.xmlgraphics:batik-css:1.7) : CVE-2017-5662, CVE-2015-0250, CVE-2018-8013
jackson-databind-2.8.4.jar (com.fasterxml.jackson.core:jackson-databind:2.8.4, cpe:/a:fasterxml:jackson:2.8.4, cpe:/a:fasterxml:jackson-databind:2.8.4) : CVE-2018-14719, CVE-2018-1000873, CVE-2018-14718, CVE-2017-7525, CVE-2018-7489, CVE-2018-14721, CVE-2018-14720, CVE-2018-5968, CVE-2017-15095, CVE-2017-17485, CVE-2018-19362, CVE-2018-19361, CVE-2018-19360
bcprov-jdk15on-1.55.jar (cpe:/a:bouncycastle:legion-of-the-bouncy-castle-java-crytography-api:1.55, cpe:/a:bouncycastle:bouncy-castle-crypto-package:1.55, org.bouncycastle:bcprov-jdk15on:1.55, cpe:/a:bouncycastle:bouncy_castle_crypto_package:1.55) : CVE-2016-1000341, CVE-2016-1000352, CVE-2016-1000340, CVE-2018-1000613, CVE-2016-1000339, CVE-2016-1000346, CVE-2016-1000338, CVE-2017-13098, CVE-2016-1000343, CVE-2018-1000180, CVE-2016-1000342, CVE-2016-1000345, CVE-2016-1000344
tika-core-1.14.jar (cpe:/a:apache:tika:1.14, org.apache.tika:tika-core:1.14) : CVE-2018-1335, CVE-2018-17197, CVE-2018-11796, CVE-2018-8017, CVE-2018-1338, CVE-2018-11761, CVE-2018-11762, CVE-2018-1339
vorbis-java-tika-0.8.jar (org.gagravarr:vorbis-java-tika:0.8, cpe:/a:apache:tika:0.8) : CVE-2016-6809, CVE-2018-1335, CVE-2018-11796, CVE-2018-1338, CVE-2018-11761, CVE-2018-1339
xz-1.5.jar (org.tukaani:xz:1.5, cpe:/a:tukaani:xz:1.5) : CVE-2015-4035
pdfbox-2.0.3.jar (cpe:/a:apache:pdfbox:2.0.3, org.apache.pdfbox:pdfbox:2.0.3) : CVE-2018-11797
fontbox-2.0.3.jar (cpe:/a:apache:pdfbox:2.0.3, org.apache.pdfbox:fontbox:2.0.3) : CVE-2018-11797
jempbox-1.8.12.jar (cpe:/a:apache:pdfbox:1.8.12, org.apache.pdfbox:jempbox:1.8.12) : CVE-2018-11797
rome-1.5.1.jar (cpe:/a:all-for-one:all_for_one:1.5.1, com.rometools:rome:1.5.1, cpe:/a:feeds_project:feeds:1.5.1) : CVE-2018-12056
maven-scm-provider-svnexe-1.4.jar (cpe:/a:apache:subversion:1.4.0, org.apache.maven.scm:maven-scm-provider-svnexe:1.4) : CVE-2014-3580, CVE-2014-8108, CVE-2010-4644, CVE-2013-4505, CVE-2014-0032, CVE-2017-9800, CVE-2015-5343, CVE-2013-1968, CVE-2013-1846, CVE-2010-4539, CVE-2015-3187, CVE-2011-0715, CVE-2013-2088, CVE-2016-2167, CVE-2016-2168, CVE-2013-2112, CVE-2014-3522, CVE-2016-8734, CVE-2013-4277, CVE-2014-3528, CVE-2014-3504, CVE-2011-1752
cxf-core-3.0.3.jar (org.apache.cxf:cxf-core:3.0.3, cpe:/a:apache:cxf:3.0.3) : CVE-2017-12624, CVE-2017-5653, CVE-2017-3156, CVE-2016-8739, CVE-2017-5656, CVE-2015-5253, CVE-2018-8039, CVE-2016-6812
opennlp-tools-1.5.3.jar (cpe:/a:apache:opennlp:1.5.3, org.apache.opennlp:opennlp-tools:1.5.3) : CVE-2017-12620
protobuf-java-2.5.0.jar (cpe:/a:google:protobuf:2.5.0, com.google.protobuf:protobuf-java:2.5.0) : CVE-2015-5237
bzip2-0.9.1.jar (cpe:/a:bzip:bzip2:0.9.1, org.itadaki:bzip2:0.9.1) : CVE-2011-4089, CVE-2010-0405, CVE-2005-1260
logback-core-1.1.7.jar (ch.qos.logback:logback-core:1.1.7, cpe:/a:logback:logback:1.1.7) : CVE-2017-5929
clamav-client-1.0.1.jar (fi.solita.clamav:clamav-client:1.0.1, cpe:/a:clamav:clamav:1.0.1) : CVE-2018-0361, CVE-2016-1405, CVE-2018-0360, CVE-2018-15378
spring-security-core-4.2.2.RELEASE.jar (cpe:/a:pivotal_software:spring_security:4.2.2, org.springframework.security:spring-security-core:4.2.2.RELEASE) : CVE-2017-4995, CVE-2018-1199
spring-aop-4.3.5.RELEASE.jar (cpe:/a:pivotal_software:spring_framework:4.3.5, cpe:/a:pivotal:spring_framework:4.3.5, org.springframework:spring-aop:4.3.5.RELEASE, cpe:/a:springsource:spring_framework:4.3.5) : CVE-2018-1257, CVE-2018-1275, CVE-2018-11040, CVE-2018-1199, CVE-2018-1271, CVE-2018-1270, CVE-2018-15756, CVE-2018-1272, CVE-2018-11039
spring-core-4.3.5.RELEASE.jar (cpe:/a:pivotal_software:spring_framework:4.3.5, org.springframework:spring-core:4.3.5.RELEASE, cpe:/a:pivotal:spring_framework:4.3.5, cpe:/a:vmware:springsource_spring_framework:4.3.5, cpe:/a:springsource:spring_framework:4.3.5) : CVE-2018-1257, CVE-2018-1275, CVE-2018-11040, CVE-2018-1199, CVE-2018-1271, CVE-2018-1270, CVE-2018-15756, CVE-2018-1272, CVE-2018-11039
guava-21.0.jar (com.google.guava:guava:21.0, cpe:/a:google:guava:21.0) : CVE-2018-10237

See the dependency-check report for more details.

[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 01:11 min
[INFO] Finished at: 2019-01-28T22:47:10+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.owasp:dependency-check-maven:4.0.2:check (default) on project terracotta-bank:
[ERROR]
[ERROR] One or more dependencies were identified with vulnerabilities that have a CVSS score greater than or equal to '8.0':
[ERROR]
[ERROR] tika-core-1.14.jar: CVE-2018-1335
[ERROR] vorbis-java-tika-0.8.jar: CVE-2018-1335
[ERROR] maven-scm-provider-svnexe-1.4.jar: CVE-2015-5343
[ERROR]
[ERROR] See the dependency-check report for more details.
```

* `mvn site` to generate the checker HTML report as part of your site documentation.