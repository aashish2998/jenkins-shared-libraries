def call(String url , String branch){
 // echo "This is Cloning the code"
  git url: "${url}",branch :"${branch}"
   //echo "The code is cloned successfully"
}
  
