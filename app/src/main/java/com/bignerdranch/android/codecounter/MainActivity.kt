package com.bignerdranch.android.codecounter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.codecounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //var scoreTeamA = 0
    //var scoreTeamB = 0
    private lateinit var binding: ActivityMainBinding
    private val countViewModel: CountViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addThreeA.setOnClickListener{
            countViewModel.addThreeForTeamA()
            countViewModel.displayForTeamA(countViewModel.currentScoreA)
        }
        binding.addThreeB.setOnClickListener{
            countViewModel.addThreeForTeamB()
            countViewModel.displayForTeamB(countViewModel.currentScoreB)
        }
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    /*fun addOneForTeamA(v: View?) {
        //scoreTeamA++
        //displayForTeamA(scoreTeamA)
    }

    *//**
     * Increase the score for Team A by 2 points.
     *//*
    fun addTwoForTeamA(v: View?) {
        //scoreTeamA += 2
        //displayForTeamA(scoreTeamA)
    }

    *//**
     * Increase the score for Team A by 3 points.
     *//*
    fun addThreeForTeamA(v: View?) {
        scoreTeamA += 3
        displayForTeamA(scoreTeamA)
    }

    *//**
     * Increase the score for Team B by 1 point.
     *//*
    fun addOneForTeamB(v: View?) {
        scoreTeamB++
        displayForTeamB(scoreTeamB)
    }

    *//**
     * Increase the score for Team B by 2 points.
     *//*
    fun addTwoForTeamB(v: View?) {
        scoreTeamB += 2
        displayForTeamB(scoreTeamB)
    }

    *//**
     * Increase the score for Team B by 3 points.
     *//*
    fun addThreeForTeamB(v: View?) {
        scoreTeamB += 3
        displayForTeamB(scoreTeamB)
    }

    *//**
     * Resets the score for both teams back to 0.
     *//*
    fun resetScore(v: View?) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }


     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}
