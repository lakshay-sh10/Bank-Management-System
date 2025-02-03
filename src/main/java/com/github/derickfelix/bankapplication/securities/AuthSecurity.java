/*
* The MIT License
*
* Copyright (c) 2019 Derick Felix
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
 */
package com.github.derickfelix.bankapplication.securities;

import com.github.derickfelix.bankapplication.models.Customer;
import com.github.derickfelix.bankapplication.models.User;

public class AuthSecurity {
    
    private static User userAuthenticated;
    private static Customer customerAuthenticated;
    
    private AuthSecurity()
    {
    }
    
    public static void login(User user)
    {
        userAuthenticated = user;
    }
    
    public static void login(Customer customer)
    {
        customerAuthenticated = customer;
    }
    
    public static void logout()
    {
        userAuthenticated = null;
        customerAuthenticated = null;
    }
    
    public static User getUser()
    {
        return userAuthenticated;
    }
    
    public static Customer getCustomer()
    {
        return customerAuthenticated;
    }
    
    public static boolean isUserAuthenticated()
    {
        return userAuthenticated != null;
    }
    
    public static boolean isCustomerAuthenticated()
    {
        return customerAuthenticated != null;
    }
    
    public static boolean isUserAdmin()
    {
        return userAuthenticated != null && userAuthenticated.getRole().equals("Administrator");
    }
}
