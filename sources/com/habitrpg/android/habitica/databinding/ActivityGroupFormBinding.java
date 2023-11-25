package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityGroupFormBinding implements a {
    public final ImageButton cancelButton;
    public final TextInputEditText groupDescriptionEditText;
    public final TextInputEditText groupNameEditText;
    public final SwitchMaterial leaderCreateChallengeSwitch;
    public final View privacySeparator;
    public final Spinner privacySpinner;
    public final LinearLayout privacyWrapper;
    private final FrameLayout rootView;
    public final Button saveButton;

    private ActivityGroupFormBinding(FrameLayout frameLayout, ImageButton imageButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, SwitchMaterial switchMaterial, View view, Spinner spinner, LinearLayout linearLayout, Button button) {
        this.rootView = frameLayout;
        this.cancelButton = imageButton;
        this.groupDescriptionEditText = textInputEditText;
        this.groupNameEditText = textInputEditText2;
        this.leaderCreateChallengeSwitch = switchMaterial;
        this.privacySeparator = view;
        this.privacySpinner = spinner;
        this.privacyWrapper = linearLayout;
        this.saveButton = button;
    }

    public static ActivityGroupFormBinding bind(View view) {
        int i10 = R.id.cancel_button;
        ImageButton imageButton = (ImageButton) b.a(view, R.id.cancel_button);
        if (imageButton != null) {
            i10 = R.id.group_description_edit_text;
            TextInputEditText textInputEditText = (TextInputEditText) b.a(view, R.id.group_description_edit_text);
            if (textInputEditText != null) {
                i10 = R.id.group_name_edit_text;
                TextInputEditText textInputEditText2 = (TextInputEditText) b.a(view, R.id.group_name_edit_text);
                if (textInputEditText2 != null) {
                    i10 = R.id.leader_create_challenge_switch;
                    SwitchMaterial switchMaterial = (SwitchMaterial) b.a(view, R.id.leader_create_challenge_switch);
                    if (switchMaterial != null) {
                        i10 = R.id.privacy_separator;
                        View a10 = b.a(view, R.id.privacy_separator);
                        if (a10 != null) {
                            i10 = R.id.privacySpinner;
                            Spinner spinner = (Spinner) b.a(view, R.id.privacySpinner);
                            if (spinner != null) {
                                i10 = R.id.privacyWrapper;
                                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.privacyWrapper);
                                if (linearLayout != null) {
                                    i10 = R.id.save_button;
                                    Button button = (Button) b.a(view, R.id.save_button);
                                    if (button != null) {
                                        return new ActivityGroupFormBinding((FrameLayout) view, imageButton, textInputEditText, textInputEditText2, switchMaterial, a10, spinner, linearLayout, button);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityGroupFormBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGroupFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_group_form, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
