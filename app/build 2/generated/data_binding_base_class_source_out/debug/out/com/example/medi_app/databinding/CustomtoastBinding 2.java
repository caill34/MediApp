// Generated by view binder compiler. Do not edit!
package com.example.medi_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medi_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomtoastBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView customToastImage;

  @NonNull
  public final TextView textViewToast;

  private CustomtoastBinding(@NonNull LinearLayout rootView, @NonNull ImageView customToastImage,
      @NonNull TextView textViewToast) {
    this.rootView = rootView;
    this.customToastImage = customToastImage;
    this.textViewToast = textViewToast;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomtoastBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomtoastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.customtoast, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomtoastBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.customToastImage;
      ImageView customToastImage = ViewBindings.findChildViewById(rootView, id);
      if (customToastImage == null) {
        break missingId;
      }

      id = R.id.textViewToast;
      TextView textViewToast = ViewBindings.findChildViewById(rootView, id);
      if (textViewToast == null) {
        break missingId;
      }

      return new CustomtoastBinding((LinearLayout) rootView, customToastImage, textViewToast);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}