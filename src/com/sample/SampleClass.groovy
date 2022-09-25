#!/usr/bin/env groovy
package com.sample

class SampleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
}
