package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.HabiticaAutocompleteTextView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ChatBarViewBinding implements a {
    public final LinearLayout chatBarContent;
    public final HabiticaAutocompleteTextView chatEditText;
    public final Button communityGuidelinesAcceptButton;
    public final TextView communityGuidelinesReviewView;
    public final LinearLayout communityGuidelinesView;
    public final View indicatorSpacing;
    private final View rootView;
    public final ImageButton sendButton;
    public final TextView textIndicator;

    private ChatBarViewBinding(View view, LinearLayout linearLayout, HabiticaAutocompleteTextView habiticaAutocompleteTextView, Button button, TextView textView, LinearLayout linearLayout2, View view2, ImageButton imageButton, TextView textView2) {
        this.rootView = view;
        this.chatBarContent = linearLayout;
        this.chatEditText = habiticaAutocompleteTextView;
        this.communityGuidelinesAcceptButton = button;
        this.communityGuidelinesReviewView = textView;
        this.communityGuidelinesView = linearLayout2;
        this.indicatorSpacing = view2;
        this.sendButton = imageButton;
        this.textIndicator = textView2;
    }

    public static ChatBarViewBinding bind(View view) {
        int i10 = R.id.chatBarContent;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.chatBarContent);
        if (linearLayout != null) {
            i10 = R.id.chatEditText;
            HabiticaAutocompleteTextView habiticaAutocompleteTextView = (HabiticaAutocompleteTextView) b.a(view, R.id.chatEditText);
            if (habiticaAutocompleteTextView != null) {
                i10 = R.id.communityGuidelinesAcceptButton;
                Button button = (Button) b.a(view, R.id.communityGuidelinesAcceptButton);
                if (button != null) {
                    i10 = R.id.communityGuidelinesReviewView;
                    TextView textView = (TextView) b.a(view, R.id.communityGuidelinesReviewView);
                    if (textView != null) {
                        i10 = R.id.communityGuidelinesView;
                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.communityGuidelinesView);
                        if (linearLayout2 != null) {
                            i10 = R.id.indicator_spacing;
                            View a10 = b.a(view, R.id.indicator_spacing);
                            if (a10 != null) {
                                i10 = R.id.sendButton;
                                ImageButton imageButton = (ImageButton) b.a(view, R.id.sendButton);
                                if (imageButton != null) {
                                    i10 = R.id.text_indicator;
                                    TextView textView2 = (TextView) b.a(view, R.id.text_indicator);
                                    if (textView2 != null) {
                                        return new ChatBarViewBinding(view, linearLayout, habiticaAutocompleteTextView, button, textView, linearLayout2, a10, imageButton, textView2);
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

    public static ChatBarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.chat_bar_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
