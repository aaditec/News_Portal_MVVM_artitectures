package com.nitv.newsapp.ui.favorite;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.nitv.newsapp.R;
import com.nitv.newsapp.data.model.NewsArticle;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FavoriteFragmentDirections {
  private FavoriteFragmentDirections() {
  }

  @NonNull
  public static ActionFavoriteFragmentToDetailsFragment actionFavoriteFragmentToDetailsFragment(
      @NonNull NewsArticle news) {
    return new ActionFavoriteFragmentToDetailsFragment(news);
  }

  public static class ActionFavoriteFragmentToDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionFavoriteFragmentToDetailsFragment(@NonNull NewsArticle news) {
      if (news == null) {
        throw new IllegalArgumentException("Argument \"news\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("news", news);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFavoriteFragmentToDetailsFragment setNews(@NonNull NewsArticle news) {
      if (news == null) {
        throw new IllegalArgumentException("Argument \"news\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("news", news);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_favoriteFragment_to_detailsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public NewsArticle getNews() {
      return (NewsArticle) arguments.get("news");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFavoriteFragmentToDetailsFragment that = (ActionFavoriteFragmentToDetailsFragment) object;
      if (arguments.containsKey("news") != that.arguments.containsKey("news")) {
        return false;
      }
      if (getNews() != null ? !getNews().equals(that.getNews()) : that.getNews() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getNews() != null ? getNews().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFavoriteFragmentToDetailsFragment(actionId=" + getActionId() + "){"
          + "news=" + getNews()
          + "}";
    }
  }
}
