/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node focusNode) {
        if(focusNode.data>=0 && focusNode.data<=10000)
        {
           if(focusNode.left!= null){
                    if(checkBST(focusNode.left))
                    {
                            if(focusNode.left.data> focusNode.data){
                                return false;}
                            else {return true;}
                        
                        
                        }
                else{
                    return false;
                }
            }
            
       
              
            if(focusNode.right!=null){
                    if(checkBST(focusNode.right)){
                            if(focusNode.right.data < focusNode.data )    
                                return false;
                            else 
                                return true;
                    }
                else return false;
            }    
         return true; 
        }
        else
        {
            return false;
        }
    }
