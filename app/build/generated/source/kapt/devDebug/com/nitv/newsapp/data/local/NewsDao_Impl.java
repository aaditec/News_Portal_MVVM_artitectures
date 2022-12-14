package com.nitv.newsapp.data.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.nitv.newsapp.data.model.NewsArticle;
import com.nitv.newsapp.data.model.Source;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDao_Impl implements NewsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NewsArticle> __insertionAdapterOfNewsArticle;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<NewsArticle> __deletionAdapterOfNewsArticle;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllNews;

  public NewsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNewsArticle = new EntityInsertionAdapter<NewsArticle>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `news_articles` (`id`,`author`,`content`,`description`,`publishedAt`,`source`,`title`,`url`,`urlToImage`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsArticle value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPublishedAt());
        }
        final String _tmp = __converters.fromSource(value.getSource());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUrl());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getUrlToImage());
        }
      }
    };
    this.__deletionAdapterOfNewsArticle = new EntityDeletionOrUpdateAdapter<NewsArticle>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `news_articles` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsArticle value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllNews = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete FROM news_articles";
        return _query;
      }
    };
  }

  @Override
  public Object upsert(final NewsArticle newsArticle,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNewsArticle.insert(newsArticle);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void deleteNews(final NewsArticle newsArticle) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfNewsArticle.handle(newsArticle);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllNews() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllNews.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllNews.release(_stmt);
    }
  }

  @Override
  public LiveData<List<NewsArticle>> getAllNews() {
    final String _sql = "SELECT `news_articles`.`id` AS `id`, `news_articles`.`author` AS `author`, `news_articles`.`content` AS `content`, `news_articles`.`description` AS `description`, `news_articles`.`publishedAt` AS `publishedAt`, `news_articles`.`source` AS `source`, `news_articles`.`title` AS `title`, `news_articles`.`url` AS `url`, `news_articles`.`urlToImage` AS `urlToImage` FROM news_articles";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"news_articles"}, false, new Callable<List<NewsArticle>>() {
      @Override
      public List<NewsArticle> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = 0;
          final int _cursorIndexOfAuthor = 1;
          final int _cursorIndexOfContent = 2;
          final int _cursorIndexOfDescription = 3;
          final int _cursorIndexOfPublishedAt = 4;
          final int _cursorIndexOfSource = 5;
          final int _cursorIndexOfTitle = 6;
          final int _cursorIndexOfUrl = 7;
          final int _cursorIndexOfUrlToImage = 8;
          final List<NewsArticle> _result = new ArrayList<NewsArticle>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NewsArticle _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpPublishedAt;
            if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
              _tmpPublishedAt = null;
            } else {
              _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
            }
            final Source _tmpSource;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSource)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSource);
            }
            _tmpSource = __converters.toSource(_tmp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpUrlToImage;
            if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
              _tmpUrlToImage = null;
            } else {
              _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
            }
            _item = new NewsArticle(_tmpId,_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpSource,_tmpTitle,_tmpUrl,_tmpUrlToImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
