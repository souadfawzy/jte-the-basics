void call(){
node{
 stage("Maven: build scm"){
    
       println "build from the maven library"
       //sh "mvn clean verify"
       sh 'mvn  -f EmiratesAirlinesTodoApp/pom.xml -B -DskipTests clean package'

         //sh 'mvn -pl journey-services -DskipTests package'
         //sh 'mvn -pl confsrv -DskipTests package'
    
    }
        }
}