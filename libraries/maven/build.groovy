void call(){
 stage("Maven: build scm"){
    node{
       println "build from the maven library"
       sh "mvn clean verify"
    
    }
        }
}