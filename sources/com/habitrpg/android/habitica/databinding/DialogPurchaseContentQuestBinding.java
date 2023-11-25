package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogPurchaseContentQuestBinding implements a {
    public final TextView bossHealthText;
    public final TableRow bossHealthView;
    public final PixelArtView imageView;
    public final TextView notesTextView;
    public final LinearLayout ownerRewardsList;
    public final TextView ownerRewardsTitle;
    public final TextView questCollectText;
    public final TableRow questCollectView;
    public final TableLayout questDetailView;
    public final RatingBar questDifficultyView;
    public final TextView questTypeTextView;
    public final TextView rageMeterView;
    public final LinearLayout rewardsList;
    private final View rootView;
    public final TextView titleTextView;

    private DialogPurchaseContentQuestBinding(View view, TextView textView, TableRow tableRow, PixelArtView pixelArtView, TextView textView2, LinearLayout linearLayout, TextView textView3, TextView textView4, TableRow tableRow2, TableLayout tableLayout, RatingBar ratingBar, TextView textView5, TextView textView6, LinearLayout linearLayout2, TextView textView7) {
        this.rootView = view;
        this.bossHealthText = textView;
        this.bossHealthView = tableRow;
        this.imageView = pixelArtView;
        this.notesTextView = textView2;
        this.ownerRewardsList = linearLayout;
        this.ownerRewardsTitle = textView3;
        this.questCollectText = textView4;
        this.questCollectView = tableRow2;
        this.questDetailView = tableLayout;
        this.questDifficultyView = ratingBar;
        this.questTypeTextView = textView5;
        this.rageMeterView = textView6;
        this.rewardsList = linearLayout2;
        this.titleTextView = textView7;
    }

    public static DialogPurchaseContentQuestBinding bind(View view) {
        int i10 = R.id.boss_health_text;
        TextView textView = (TextView) b.a(view, R.id.boss_health_text);
        if (textView != null) {
            i10 = R.id.boss_health_view;
            TableRow tableRow = (TableRow) b.a(view, R.id.boss_health_view);
            if (tableRow != null) {
                i10 = R.id.imageView;
                PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
                if (pixelArtView != null) {
                    i10 = R.id.notesTextView;
                    TextView textView2 = (TextView) b.a(view, R.id.notesTextView);
                    if (textView2 != null) {
                        i10 = R.id.ownerRewardsList;
                        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.ownerRewardsList);
                        if (linearLayout != null) {
                            i10 = R.id.ownerRewardsTitle;
                            TextView textView3 = (TextView) b.a(view, R.id.ownerRewardsTitle);
                            if (textView3 != null) {
                                i10 = R.id.quest_collect_text;
                                TextView textView4 = (TextView) b.a(view, R.id.quest_collect_text);
                                if (textView4 != null) {
                                    i10 = R.id.quest_collect_view;
                                    TableRow tableRow2 = (TableRow) b.a(view, R.id.quest_collect_view);
                                    if (tableRow2 != null) {
                                        i10 = R.id.questDetailView;
                                        TableLayout tableLayout = (TableLayout) b.a(view, R.id.questDetailView);
                                        if (tableLayout != null) {
                                            i10 = R.id.quest_difficulty_view;
                                            RatingBar ratingBar = (RatingBar) b.a(view, R.id.quest_difficulty_view);
                                            if (ratingBar != null) {
                                                i10 = R.id.questTypeTextView;
                                                TextView textView5 = (TextView) b.a(view, R.id.questTypeTextView);
                                                if (textView5 != null) {
                                                    i10 = R.id.rage_meter_view;
                                                    TextView textView6 = (TextView) b.a(view, R.id.rage_meter_view);
                                                    if (textView6 != null) {
                                                        i10 = R.id.rewardsList;
                                                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.rewardsList);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.titleTextView;
                                                            TextView textView7 = (TextView) b.a(view, R.id.titleTextView);
                                                            if (textView7 != null) {
                                                                return new DialogPurchaseContentQuestBinding(view, textView, tableRow, pixelArtView, textView2, linearLayout, textView3, textView4, tableRow2, tableLayout, ratingBar, textView5, textView6, linearLayout2, textView7);
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

    public static DialogPurchaseContentQuestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.dialog_purchase_content_quest, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
