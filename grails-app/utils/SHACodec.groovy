/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raunak Shakya
 */
import java.security.MessageDigest 
class SHACodec{ 
    static encode = {target-> 
        MessageDigest md = MessageDigest.getInstance('SHA') 
        md.update(target.getBytes('UTF-8')) 
        return new String(md.digest()).encodeAsBase64() 
    } 
}

