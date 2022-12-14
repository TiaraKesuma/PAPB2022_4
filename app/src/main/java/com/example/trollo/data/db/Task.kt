package com.example.trollo.data.db

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "tasks")
@Parcelize()
data class Task(@PrimaryKey(autoGenerate = true) val id: Long?,
                      @ColumnInfo(name = "title") val title: String,
                      @ColumnInfo(name = "description") val description: String,
                      @ColumnInfo(name = "due_date") val due_date: String,) : Parcelable
