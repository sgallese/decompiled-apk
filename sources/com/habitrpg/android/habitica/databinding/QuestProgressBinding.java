package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CollapsibleSectionView;
import com.habitrpg.common.habitica.views.PixelArtView;
import com.habitrpg.common.habitica.views.ValueBar;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class QuestProgressBinding implements a {
    public final TextView artCreditTextView;
    public final ValueBar bossHealthView;
    public final TextView bossNameView;
    public final ValueBar bossRageView;
    public final ImageView caretView;
    public final TextView collectedItemsNumberView;
    public final LinearLayout collectionContainer;
    public final ImageView pendingDamageIconView;
    public final TextView pendingDamageTextView;
    public final TextView questDescription;
    public final CollapsibleSectionView questDescriptionSection;
    public final PixelArtView questFlourishesImageView;
    public final View questImageSeparator;
    public final LinearLayout questImageTitle;
    public final PixelArtView questImageView;
    public final FrameLayout questImageWrapper;
    public final TextView rageMeterView;
    public final LinearLayout rageStrikeContainer;
    public final TextView rageStrikeDescriptionView;
    private final LinearLayout rootView;

    private QuestProgressBinding(LinearLayout linearLayout, TextView textView, ValueBar valueBar, TextView textView2, ValueBar valueBar2, ImageView imageView, TextView textView3, LinearLayout linearLayout2, ImageView imageView2, TextView textView4, TextView textView5, CollapsibleSectionView collapsibleSectionView, PixelArtView pixelArtView, View view, LinearLayout linearLayout3, PixelArtView pixelArtView2, FrameLayout frameLayout, TextView textView6, LinearLayout linearLayout4, TextView textView7) {
        this.rootView = linearLayout;
        this.artCreditTextView = textView;
        this.bossHealthView = valueBar;
        this.bossNameView = textView2;
        this.bossRageView = valueBar2;
        this.caretView = imageView;
        this.collectedItemsNumberView = textView3;
        this.collectionContainer = linearLayout2;
        this.pendingDamageIconView = imageView2;
        this.pendingDamageTextView = textView4;
        this.questDescription = textView5;
        this.questDescriptionSection = collapsibleSectionView;
        this.questFlourishesImageView = pixelArtView;
        this.questImageSeparator = view;
        this.questImageTitle = linearLayout3;
        this.questImageView = pixelArtView2;
        this.questImageWrapper = frameLayout;
        this.rageMeterView = textView6;
        this.rageStrikeContainer = linearLayout4;
        this.rageStrikeDescriptionView = textView7;
    }

    public static QuestProgressBinding bind(View view) {
        int i10 = R.id.artCreditTextView;
        TextView textView = (TextView) b.a(view, R.id.artCreditTextView);
        if (textView != null) {
            i10 = R.id.bossHealthView;
            ValueBar valueBar = (ValueBar) b.a(view, R.id.bossHealthView);
            if (valueBar != null) {
                i10 = R.id.bossNameView;
                TextView textView2 = (TextView) b.a(view, R.id.bossNameView);
                if (textView2 != null) {
                    i10 = R.id.bossRageView;
                    ValueBar valueBar2 = (ValueBar) b.a(view, R.id.bossRageView);
                    if (valueBar2 != null) {
                        i10 = R.id.caretView;
                        ImageView imageView = (ImageView) b.a(view, R.id.caretView);
                        if (imageView != null) {
                            i10 = R.id.collectedItemsNumberView;
                            TextView textView3 = (TextView) b.a(view, R.id.collectedItemsNumberView);
                            if (textView3 != null) {
                                i10 = R.id.collectionContainer;
                                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.collectionContainer);
                                if (linearLayout != null) {
                                    i10 = R.id.pendingDamageIconView;
                                    ImageView imageView2 = (ImageView) b.a(view, R.id.pendingDamageIconView);
                                    if (imageView2 != null) {
                                        i10 = R.id.pendingDamageTextView;
                                        TextView textView4 = (TextView) b.a(view, R.id.pendingDamageTextView);
                                        if (textView4 != null) {
                                            i10 = R.id.questDescription;
                                            TextView textView5 = (TextView) b.a(view, R.id.questDescription);
                                            if (textView5 != null) {
                                                i10 = R.id.questDescriptionSection;
                                                CollapsibleSectionView collapsibleSectionView = (CollapsibleSectionView) b.a(view, R.id.questDescriptionSection);
                                                if (collapsibleSectionView != null) {
                                                    i10 = R.id.questFlourishesImageView;
                                                    PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.questFlourishesImageView);
                                                    if (pixelArtView != null) {
                                                        i10 = R.id.questImageSeparator;
                                                        View a10 = b.a(view, R.id.questImageSeparator);
                                                        if (a10 != null) {
                                                            i10 = R.id.questImageTitle;
                                                            LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.questImageTitle);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.questImageView;
                                                                PixelArtView pixelArtView2 = (PixelArtView) b.a(view, R.id.questImageView);
                                                                if (pixelArtView2 != null) {
                                                                    i10 = R.id.questImageWrapper;
                                                                    FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.questImageWrapper);
                                                                    if (frameLayout != null) {
                                                                        i10 = R.id.rageMeterView;
                                                                        TextView textView6 = (TextView) b.a(view, R.id.rageMeterView);
                                                                        if (textView6 != null) {
                                                                            i10 = R.id.rageStrikeContainer;
                                                                            LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.rageStrikeContainer);
                                                                            if (linearLayout3 != null) {
                                                                                i10 = R.id.rageStrikeDescriptionView;
                                                                                TextView textView7 = (TextView) b.a(view, R.id.rageStrikeDescriptionView);
                                                                                if (textView7 != null) {
                                                                                    return new QuestProgressBinding((LinearLayout) view, textView, valueBar, textView2, valueBar2, imageView, textView3, linearLayout, imageView2, textView4, textView5, collapsibleSectionView, pixelArtView, a10, linearLayout2, pixelArtView2, frameLayout, textView6, linearLayout3, textView7);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static QuestProgressBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static QuestProgressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.quest_progress, viewGroup, false);
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
