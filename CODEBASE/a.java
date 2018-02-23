boolean checkBST(Node focusNode) {
        if(focusNode.data>=0 && focusNode.data<=10000)
        {
                if(focusNode.left!= null){


                    if(focusNode.left!=null && checkBST(focusNode.left))
                    {
                            if(focusNode.left.data> focusNode.data){
                                return false;}
                            else {
                            //System.out.println(focusNode);
                            if(focusNode.right!=null){
                                    if(focusNode.right!=null && checkBST(focusNode.right)){
                                        if(focusNode.right.data < focusNode.data )    
                                            return false;
                                        else 
                                            return true;
                                    }
                                    else{
                                        return false;
                                    }
                            }
                            else return false;
                    }
                            //else return false;
                    } 
                    else return false; 
            }
                //else{return false;}
            return true;
        }
        else
        {
            return false;
        }
    }