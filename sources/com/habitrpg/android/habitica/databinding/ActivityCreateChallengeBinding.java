package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityCreateChallengeBinding implements a {
    public final ImageButton challengeAddGemBtn;
    public final LinearLayout challengeCreationViews;
    public final Spinner challengeLocationSpinner;
    public final ImageButton challengeRemoveGemBtn;
    public final TextInputEditText createChallengeDescription;
    public final TextView createChallengeGemError;
    public final EditText createChallengePrize;
    public final TextInputEditText createChallengeTag;
    public final TextInputLayout createChallengeTagInputLayout;
    public final TextView createChallengeTaskError;
    public final RecyclerView createChallengeTaskList;
    public final TextInputEditText createChallengeTitle;
    public final TextInputLayout createChallengeTitleInputLayout;
    public final ImageView gemIconView;
    private final LinearLayout rootView;
    public final Toolbar toolbar;

    private ActivityCreateChallengeBinding(LinearLayout linearLayout, ImageButton imageButton, LinearLayout linearLayout2, Spinner spinner, ImageButton imageButton2, TextInputEditText textInputEditText, TextView textView, EditText editText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextView textView2, RecyclerView recyclerView, TextInputEditText textInputEditText3, TextInputLayout textInputLayout2, ImageView imageView, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.challengeAddGemBtn = imageButton;
        this.challengeCreationViews = linearLayout2;
        this.challengeLocationSpinner = spinner;
        this.challengeRemoveGemBtn = imageButton2;
        this.createChallengeDescription = textInputEditText;
        this.createChallengeGemError = textView;
        this.createChallengePrize = editText;
        this.createChallengeTag = textInputEditText2;
        this.createChallengeTagInputLayout = textInputLayout;
        this.createChallengeTaskError = textView2;
        this.createChallengeTaskList = recyclerView;
        this.createChallengeTitle = textInputEditText3;
        this.createChallengeTitleInputLayout = textInputLayout2;
        this.gemIconView = imageView;
        this.toolbar = toolbar;
    }

    public static ActivityCreateChallengeBinding bind(View view) {
        int i10 = R.id.challenge_add_gem_btn;
        ImageButton imageButton = (ImageButton) b.a(view, R.id.challenge_add_gem_btn);
        if (imageButton != null) {
            i10 = R.id.challenge_creation_views;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.challenge_creation_views);
            if (linearLayout != null) {
                i10 = R.id.challenge_location_spinner;
                Spinner spinner = (Spinner) b.a(view, R.id.challenge_location_spinner);
                if (spinner != null) {
                    i10 = R.id.challenge_remove_gem_btn;
                    ImageButton imageButton2 = (ImageButton) b.a(view, R.id.challenge_remove_gem_btn);
                    if (imageButton2 != null) {
                        i10 = R.id.create_challenge_description;
                        TextInputEditText textInputEditText = (TextInputEditText) b.a(view, R.id.create_challenge_description);
                        if (textInputEditText != null) {
                            i10 = R.id.create_challenge_gem_error;
                            TextView textView = (TextView) b.a(view, R.id.create_challenge_gem_error);
                            if (textView != null) {
                                i10 = R.id.create_challenge_prize;
                                EditText editText = (EditText) b.a(view, R.id.create_challenge_prize);
                                if (editText != null) {
                                    i10 = R.id.create_challenge_tag;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) b.a(view, R.id.create_challenge_tag);
                                    if (textInputEditText2 != null) {
                                        i10 = R.id.create_challenge_tag_input_layout;
                                        TextInputLayout textInputLayout = (TextInputLayout) b.a(view, R.id.create_challenge_tag_input_layout);
                                        if (textInputLayout != null) {
                                            i10 = R.id.create_challenge_task_error;
                                            TextView textView2 = (TextView) b.a(view, R.id.create_challenge_task_error);
                                            if (textView2 != null) {
                                                i10 = R.id.create_challenge_task_list;
                                                RecyclerView recyclerView = (RecyclerView) b.a(view, R.id.create_challenge_task_list);
                                                if (recyclerView != null) {
                                                    i10 = R.id.create_challenge_title;
                                                    TextInputEditText textInputEditText3 = (TextInputEditText) b.a(view, R.id.create_challenge_title);
                                                    if (textInputEditText3 != null) {
                                                        i10 = R.id.create_challenge_title_input_layout;
                                                        TextInputLayout textInputLayout2 = (TextInputLayout) b.a(view, R.id.create_challenge_title_input_layout);
                                                        if (textInputLayout2 != null) {
                                                            i10 = R.id.gem_icon_view;
                                                            ImageView imageView = (ImageView) b.a(view, R.id.gem_icon_view);
                                                            if (imageView != null) {
                                                                i10 = R.id.toolbar;
                                                                Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                                                                if (toolbar != null) {
                                                                    return new ActivityCreateChallengeBinding((LinearLayout) view, imageButton, linearLayout, spinner, imageButton2, textInputEditText, textView, editText, textInputEditText2, textInputLayout, textView2, recyclerView, textInputEditText3, textInputLayout2, imageView, toolbar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static ActivityCreateChallengeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCreateChallengeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_create_challenge, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
