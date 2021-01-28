package com.cwang81.tinnews.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.cwang81.tinnews.model.Article;

@Database(entities = {Article.class}, version = 1, exportSchema = false)
public abstract class TinNewsDatabase extends RoomDatabase {

    public abstract ArticleDao articleDao();

}
