package com.willshuffyproject.myunittestingexample

class MainViewModel(private val cuboidModel: CuboidModel) {

    fun getCircumFerence(): Double = cuboidModel.getCircumFerence()

    fun getSurfaceArea(): Double = cuboidModel.getSurfaceArea()

    fun getVolume(): Double = cuboidModel.getVolume()

    fun save(l: Double, w: Double, h: Double){
        cuboidModel.save(l,w,h)
    }
}