cara install sdk java 
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="C:\Users\AFP\Downloads\demo_psdk\demo\lib\JavaPasswordSDK.jar" -DgroupId="com.cyberark" -DartifactId="JavaPasswordSDK"  -Dversion="1.0.0"  -Dpackaging="jar"

mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="C:\Users\AFP\Downloads\demo_psdk\demo\lib\jdbc2_0-stdext.jar" -DgroupId="javax.sql" -DartifactId="jdbc-stdext"  -Dversion="2.0"  -Dpackaging="jar"

Build & Run docker 
docker build -f Dockerfile -t docker-demopsdk .
docker run -p 8081:8080 docker-demopsdk  