package com.bignerdranch.android.codecounter

import android.util.Log
import android.view.View
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.bignerdranch.android.codecounter.databinding.ActivityMainBinding


private const val TAG = "CountViewModel"
const val CURRENT_INDEX = "CURRENT_INDEX_KEY"
private lateinit var binding: ActivityMainBinding

class CountViewModel : ViewModel() {


    var scoreTeamA = 0
    var scoreTeamB = 0

    val currentScoreA: Int
        get() = scoreTeamA
    val currentScoreB: Int
        get() = scoreTeamB

    fun addOneForTeamA(v: View?) {
        scoreTeamA++
        displayForTeamA(scoreTeamA)
    }

    fun addTwoForTeamA() {
        scoreTeamA += 2
        displayForTeamA(scoreTeamA)
    }

    fun addThreeForTeamA() {
        scoreTeamA += 3
        displayForTeamA(scoreTeamA)
    }

    fun addOneForTeamB(v: View?) {
        scoreTeamB++
        displayForTeamB(scoreTeamB)
    }

    fun addTwoForTeamB(v: View?) {
        scoreTeamB += 2
        displayForTeamB(scoreTeamB)
    }

    fun addThreeForTeamB() {
        scoreTeamB += 3
        displayForTeamB(scoreTeamB)
    }

    fun resetScore(v: View?) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }

    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}