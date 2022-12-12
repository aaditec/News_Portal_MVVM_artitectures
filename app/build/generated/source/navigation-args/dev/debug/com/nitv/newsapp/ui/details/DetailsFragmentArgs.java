package com.nitv.newsapp.ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.nitv.newsapp.data.model.NewsArticle;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailsFragmentArgs __result = new DetailsFragmentArgs();
    bundle.setClassLoader(DetailsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("news")) {
      NewsArticle news;
      if (Parcelable.class.isAssignableFrom(NewsArticle.class) || Serializable.class.isAssignableFrom(NewsArticle.class)) {
        news = (NewsArticle) bundle.get("news");
      } else {
        throw new UnsupportedOperationException(NewsArticle.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (news == null) {
        throw new IllegalArgumentException("Argument \"news\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("news", news);
    } else {
      throw new IllegalArgumentException("Required argument \"news\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DetailsFragmentArgs __result = new DetailsFragmentArgs();
    if (savedStateHandle.contains("news")) {
      NewsArticle news;
      news = savedStateHandle.get("news");
      if (news == null) {
        throw new IllegalArgumentException("Argument \"news\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("news", news);
    } else {
      throw new IllegalArgumentException("Required argument \"news\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public NewsArticle getNews() {
    return (NewsArticle) arguments.get("news");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("news")) {
      NewsArticle news = (NewsArticle) arguments.get("news");
      if (Parcelable.class.isAssignableFrom(NewsArticle.class) || news == null) {
        __result.putParcelable("news", Parcelable.class.cast(news));
      } else if (Serializable.class.isAssignableFrom(NewsArticle.class)) {
        __result.putSerializable("news", Serializable.class.cast(news));
      } else {
        throw new UnsupportedOperationException(NewsArticle.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailsFragmentArgs that = (DetailsFragmentArgs) object;
    if (arguments.containsKey("news") != that.arguments.containsKey("news")) {
      return false;
    }
    if (getNews() != null ? !getNews().equals(that.getNews()) : that.getNews() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getNews() != null ? getNews().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailsFragmentArgs{"
        + "news=" + getNews()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(DetailsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull NewsArticle news) {
      if (news == null) {
        throw new IllegalArgumentException("Argument \"news\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("news", news);
    }

    @NonNull
    public DetailsFragmentArgs build() {
      DetailsFragmentArgs result = new DetailsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setNews(@NonNull NewsArticle news) {
      if (news == null) {
        throw new IllegalArgumentException("Argument \"news\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("news", news);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public NewsArticle getNews() {
      return (NewsArticle) arguments.get("news");
    }
  }
}
