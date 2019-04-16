package com.googlecode.aviator.runtime.function.system;

import static org.junit.Assert.*;

import org.junit.Test;

import com.googlecode.aviator.runtime.type.AviatorDouble;
import com.googlecode.aviator.runtime.type.AviatorObject;
import com.googlecode.aviator.runtime.type.AviatorRuntimeJavaType;


public class RandomFunctionUnitTest {

    @Test
    public void testCall() {
        RandomFunction rand = new RandomFunction();
        AviatorObject result = rand.call(null);
        assertTrue(result instanceof AviatorDouble);
        assertFalse(result.getValue(null).equals(rand.call(null)));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testCallIllegalArgument() {
        RandomFunction rand = new RandomFunction();
        AviatorObject result = rand.call(null, new AviatorRuntimeJavaType(1));
    }
}
