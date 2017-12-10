package com.iluwatar.singleton.kotlin

import com.iluwatar.singleton.SingletonTest
import org.junit.Assert.*
import org.junit.Test


class IvoryTwoerKTest {

    @Test
    public fun testCreatingThreeInstances(){
        val ivory1 = IvoryTwoerK
        val ivory2 = IvoryTwoerK
        val ivory3 = IvoryTwoerK

        assertEquals(ivory1, ivory2)
        assertEquals(ivory2, ivory3)
    }

}