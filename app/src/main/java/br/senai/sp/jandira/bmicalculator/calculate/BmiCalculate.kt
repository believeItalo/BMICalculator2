package br.senai.sp.jandira.bmicalculator.calculate

import kotlin.math.pow

fun calculate(weight: Double, height: Double): Double{
    return weight/ height.pow(2)
}