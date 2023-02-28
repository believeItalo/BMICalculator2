package br.senai.sp.jandira.bmicalculator.calculate

import android.content.Context
import androidx.compose.ui.res.stringResource
import br.senai.sp.jandira.bmicalculator.R
import kotlin.math.pow

fun calculate(weight: Double, height: Double): Double = weight / (height / 100).pow(2)
fun getBmiClasification(bmi: Double, context: Context): String {
    return if (bmi <= 18.5) {
        context.getString(R.string.under_weight)
    } else if (bmi > 18.5 && bmi < 25.0) {
        context.getString(R.string.normal_weight)
    }
    else if (bmi > 25 && bmi < 30.0) {
        context.getString(R.string.over_weight)
    }
    else if (bmi > 30 && bmi < 40.0) {
        context.getString(R.string.obesity)
    }else {
       context.getString(R.string.morbid_obesity)
    }
}