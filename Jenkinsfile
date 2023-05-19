node{
   stage('SCM Checkout'){
     git 'https://github.com/VickyDev-07/VotingAge.git'
   }
   stage('Compile-Package'){
	  sh 'mv target/booking1.war target/booking.war'
   }
   stage('Build Docker Imager'){
   sh 'docker build -t vickydevendran/booking:1.0 .'
   }
   stage('Docker Image Push'){
   withCredentials([string(credentialsId: 'dockerPass', variable: 'dockerPassword')]) {
   sh "docker login -u vickydevendran -p ${dockerPassword}"
    }
   sh 'docker push vickydevendran/booking:1.0'
   }
   stage('Remove Previous Container'){
	try{
		sh 'docker rm -f tomcattest'
	}catch(error){
		//  do nothing if there is an exception
	}
   stage('Docker deployment'){
   sh 'docker run -d -p 8090:8080 --name tomcattest vickydevendran/booking:1.0' 
   }
}
}
