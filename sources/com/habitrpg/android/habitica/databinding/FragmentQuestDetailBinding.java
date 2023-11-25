package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentQuestDetailBinding implements a {
    public final TextView descriptionView;
    public final TextView participantsHeader;
    public final TextView participantsHeaderCount;
    public final Button questBeginButton;
    public final Button questCancelButton;
    public final TextView questLeaderView;
    public final Button questLeaveButton;
    public final LinearLayout questParticipantList;
    public final LinearLayout questResponseWrapper;
    public final PixelArtView questScrollImageView;
    private final NestedScrollView rootView;
    public final TextView titleView;

    private FragmentQuestDetailBinding(NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, Button button, Button button2, TextView textView4, Button button3, LinearLayout linearLayout, LinearLayout linearLayout2, PixelArtView pixelArtView, TextView textView5) {
        this.rootView = nestedScrollView;
        this.descriptionView = textView;
        this.participantsHeader = textView2;
        this.participantsHeaderCount = textView3;
        this.questBeginButton = button;
        this.questCancelButton = button2;
        this.questLeaderView = textView4;
        this.questLeaveButton = button3;
        this.questParticipantList = linearLayout;
        this.questResponseWrapper = linearLayout2;
        this.questScrollImageView = pixelArtView;
        this.titleView = textView5;
    }

    public static FragmentQuestDetailBinding bind(View view) {
        int i10 = R.id.description_view;
        TextView textView = (TextView) b.a(view, R.id.description_view);
        if (textView != null) {
            i10 = R.id.participants_header;
            TextView textView2 = (TextView) b.a(view, R.id.participants_header);
            if (textView2 != null) {
                i10 = R.id.participants_header_count;
                TextView textView3 = (TextView) b.a(view, R.id.participants_header_count);
                if (textView3 != null) {
                    i10 = R.id.quest_begin_button;
                    Button button = (Button) b.a(view, R.id.quest_begin_button);
                    if (button != null) {
                        i10 = R.id.quest_cancel_button;
                        Button button2 = (Button) b.a(view, R.id.quest_cancel_button);
                        if (button2 != null) {
                            i10 = R.id.quest_leader_view;
                            TextView textView4 = (TextView) b.a(view, R.id.quest_leader_view);
                            if (textView4 != null) {
                                i10 = R.id.quest_leave_button;
                                Button button3 = (Button) b.a(view, R.id.quest_leave_button);
                                if (button3 != null) {
                                    i10 = R.id.quest_participant_list;
                                    LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.quest_participant_list);
                                    if (linearLayout != null) {
                                        i10 = R.id.quest_response_wrapper;
                                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.quest_response_wrapper);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.quest_scroll_image_view;
                                            PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.quest_scroll_image_view);
                                            if (pixelArtView != null) {
                                                i10 = R.id.title_view;
                                                TextView textView5 = (TextView) b.a(view, R.id.title_view);
                                                if (textView5 != null) {
                                                    return new FragmentQuestDetailBinding((NestedScrollView) view, textView, textView2, textView3, button, button2, textView4, button3, linearLayout, linearLayout2, pixelArtView, textView5);
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

    public static FragmentQuestDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuestDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_quest_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
