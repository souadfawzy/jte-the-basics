void call(){
node{
 stage("Maven: build scm"){
    
       println "build from the maven library"
       //sh "mvn clean verify"
       sh 'mvn -B -DskipTests clean package'
    
    }
        }
}