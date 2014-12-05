/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raunak Shakya
 */
class UnderscoreCodec { 
    static encode = {target-> 
        target.replaceAll(" ", "_") 
   } 
    static decode = {target-> 
        target.replaceAll("_", " ") 
    } 
}
