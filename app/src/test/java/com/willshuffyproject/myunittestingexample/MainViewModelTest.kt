package com.willshuffyproject.myunittestingexample

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mockito.*

class MainViewModelTest {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var cuboidModel: CuboidModel

    private val dummyLength = 12.0
    private val dummyWidth = 7.0
    private val dummyHeight = 6.0

    private val dummyVolume = 504.0
    private val dummyCircumFerence = 100.0
    private val dummySurfaceArea = 396.0


    @Before
    fun before(){
        cuboidModel = mock(CuboidModel::class.java)
        mainViewModel = MainViewModel(cuboidModel)
    }

    @Test
    fun testCircumFerence() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = mainViewModel.getCircumFerence()
        assertEquals(dummyCircumFerence, volume, 0.0001)
    }

    @Test
    fun testSurfaceArea() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = mainViewModel.getSurfaceArea()
        assertEquals(dummySurfaceArea, volume, 0.0001)
    }

    @Test
    fun testVolume() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = mainViewModel.getVolume()
        assertEquals(dummyVolume, volume, 0.0001)
    }

   @Test
   fun testMockVolume(){
       `when` (mainViewModel.getVolume()).thenReturn(dummyVolume)
       val volume = mainViewModel.getVolume()
       verify(cuboidModel).getVolume()
       assertEquals(dummyVolume, volume, 0.0001)
   }

    @Test
    fun testMockCircumFerence(){
        `when` (mainViewModel.getCircumFerence()).thenReturn(dummyCircumFerence)
        val circumFerence = mainViewModel.getCircumFerence()
        verify(cuboidModel).getCircumFerence()
        assertEquals(dummyCircumFerence, circumFerence, 0.0001)
    }

    @Test
    fun testMockSurfaceArea(){
        `when` (mainViewModel.getSurfaceArea()).thenReturn(dummySurfaceArea)
        val surfaceArea = mainViewModel.getSurfaceArea()
        verify(cuboidModel).getSurfaceArea()
        assertEquals(dummySurfaceArea, surfaceArea, 0.0001)
    }
}