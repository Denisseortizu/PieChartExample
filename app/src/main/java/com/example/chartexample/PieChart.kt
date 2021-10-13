package com.example.chartexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidplot.pie.Segment
import com.androidplot.pie.SegmentBundle
import com.androidplot.pie.SegmentFormatter
import com.example.chartexample.PieChart
import ...main.activity_pie_chart.*


class PieChart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)

        val arrayList = intent.getIntegerArrayListExtra( name: "arrayList")


        val s1 = Segment( title: "S1", arrayList.get(0))
        val s2 = Segment( title: "S2", arrayList.get(1))
        val s3 = Segment( title: "S3", arrayList.get(2))
        val s4 = Segment( title: "S4", arrayList.get(3))

        val sf1 = SegmentFormatter(Color.BLUE)
        val sf2 = SegmentFormatter(Color.MAGENTA)
        val sf3 = SegmentFormatter(Color.YELLOW)
        val sf4 = SegmentFormatter(Color.GREEN)

        PieChart.addSegment(s1, sf1)
        PieChart.addSegment(s2, sf2)
        PieChart.addSegment(s3, sf3)
        PieChart.addSegment(s4, sf4)
    }
}