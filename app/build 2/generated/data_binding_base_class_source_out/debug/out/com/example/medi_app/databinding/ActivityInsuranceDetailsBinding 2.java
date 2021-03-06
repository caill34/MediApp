// Generated by view binder compiler. Do not edit!
package com.example.medi_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medi_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityInsuranceDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView DPInsuranceEnddateTv;

  @NonNull
  public final TextView DPInsuranceStartdateTv;

  @NonNull
  public final Button insuranceCancelbutton;

  @NonNull
  public final TextView insuranceEndTv;

  @NonNull
  public final Spinner insuranceSpinner;

  @NonNull
  public final EditText policyNumberEt;

  @NonNull
  public final TextView policyNumberTv;

  @NonNull
  public final TextView policyStartTv;

  @NonNull
  public final Button submitInsuranceDets;

  @NonNull
  public final TextView topbarInsuranceDetails;

  @NonNull
  public final TextView tvInsuranceProvder;

  private ActivityInsuranceDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView DPInsuranceEnddateTv, @NonNull TextView DPInsuranceStartdateTv,
      @NonNull Button insuranceCancelbutton, @NonNull TextView insuranceEndTv,
      @NonNull Spinner insuranceSpinner, @NonNull EditText policyNumberEt,
      @NonNull TextView policyNumberTv, @NonNull TextView policyStartTv,
      @NonNull Button submitInsuranceDets, @NonNull TextView topbarInsuranceDetails,
      @NonNull TextView tvInsuranceProvder) {
    this.rootView = rootView;
    this.DPInsuranceEnddateTv = DPInsuranceEnddateTv;
    this.DPInsuranceStartdateTv = DPInsuranceStartdateTv;
    this.insuranceCancelbutton = insuranceCancelbutton;
    this.insuranceEndTv = insuranceEndTv;
    this.insuranceSpinner = insuranceSpinner;
    this.policyNumberEt = policyNumberEt;
    this.policyNumberTv = policyNumberTv;
    this.policyStartTv = policyStartTv;
    this.submitInsuranceDets = submitInsuranceDets;
    this.topbarInsuranceDetails = topbarInsuranceDetails;
    this.tvInsuranceProvder = tvInsuranceProvder;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInsuranceDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInsuranceDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_insurance_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInsuranceDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DP_insurance_enddate_tv;
      TextView DPInsuranceEnddateTv = ViewBindings.findChildViewById(rootView, id);
      if (DPInsuranceEnddateTv == null) {
        break missingId;
      }

      id = R.id.DP_insurance_startdate_tv;
      TextView DPInsuranceStartdateTv = ViewBindings.findChildViewById(rootView, id);
      if (DPInsuranceStartdateTv == null) {
        break missingId;
      }

      id = R.id.insurance_cancelbutton;
      Button insuranceCancelbutton = ViewBindings.findChildViewById(rootView, id);
      if (insuranceCancelbutton == null) {
        break missingId;
      }

      id = R.id.insurance_end_tv;
      TextView insuranceEndTv = ViewBindings.findChildViewById(rootView, id);
      if (insuranceEndTv == null) {
        break missingId;
      }

      id = R.id.insurance_spinner;
      Spinner insuranceSpinner = ViewBindings.findChildViewById(rootView, id);
      if (insuranceSpinner == null) {
        break missingId;
      }

      id = R.id.policy_number_et;
      EditText policyNumberEt = ViewBindings.findChildViewById(rootView, id);
      if (policyNumberEt == null) {
        break missingId;
      }

      id = R.id.policy_number_tv;
      TextView policyNumberTv = ViewBindings.findChildViewById(rootView, id);
      if (policyNumberTv == null) {
        break missingId;
      }

      id = R.id.policy_start_tv;
      TextView policyStartTv = ViewBindings.findChildViewById(rootView, id);
      if (policyStartTv == null) {
        break missingId;
      }

      id = R.id.submit_insurance_dets;
      Button submitInsuranceDets = ViewBindings.findChildViewById(rootView, id);
      if (submitInsuranceDets == null) {
        break missingId;
      }

      id = R.id.topbar_insurance_details;
      TextView topbarInsuranceDetails = ViewBindings.findChildViewById(rootView, id);
      if (topbarInsuranceDetails == null) {
        break missingId;
      }

      id = R.id.tv_insurance_provder;
      TextView tvInsuranceProvder = ViewBindings.findChildViewById(rootView, id);
      if (tvInsuranceProvder == null) {
        break missingId;
      }

      return new ActivityInsuranceDetailsBinding((ConstraintLayout) rootView, DPInsuranceEnddateTv,
          DPInsuranceStartdateTv, insuranceCancelbutton, insuranceEndTv, insuranceSpinner,
          policyNumberEt, policyNumberTv, policyStartTv, submitInsuranceDets,
          topbarInsuranceDetails, tvInsuranceProvder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
