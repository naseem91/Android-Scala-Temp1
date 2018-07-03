package my.android.project

import android.test.ActivityInstrumentationTestCase2

class ScalaInstrumentalTest extends ActivityInstrumentationTestCase2(classOf[MainActivity]){
  def testSomething():Unit={
    assert(true)
  }
}