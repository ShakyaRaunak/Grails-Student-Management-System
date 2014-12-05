/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminFilters

/**
 *
 * @author Raunak Shakya
 */
class AdminFilters { 
    def filters = { 
        adminOnly(controller:'*', 
            action:"(create|edit|update|delete|save)") { 
            before = { 
                if(!session?.user?.admin){ 
                    flash.message = "Sorry, admin only" 
                    redirect(controller:"Student", action:"index") 
                    return false 
                } 
            } 
        } 
    } 
}
