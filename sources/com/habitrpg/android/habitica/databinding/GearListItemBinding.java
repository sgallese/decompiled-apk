package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class GearListItemBinding implements a {
    public final TextView conLabel;
    public final TextView conValue;
    public final TextView equippedIndicator;
    public final LinearLayout gearContainer;
    public final FrameLayout gearIconBackgroundView;
    public final PixelArtView gearImage;
    public final TextView gearNotes;
    public final TextView gearText;
    public final TextView intLabel;
    public final TextView intValue;
    public final TextView perLabel;
    public final TextView perValue;
    private final LinearLayout rootView;
    public final TextView strLabel;
    public final TextView strValue;
    public final TextView twoHandedView;

    private GearListItemBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout2, FrameLayout frameLayout, PixelArtView pixelArtView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.rootView = linearLayout;
        this.conLabel = textView;
        this.conValue = textView2;
        this.equippedIndicator = textView3;
        this.gearContainer = linearLayout2;
        this.gearIconBackgroundView = frameLayout;
        this.gearImage = pixelArtView;
        this.gearNotes = textView4;
        this.gearText = textView5;
        this.intLabel = textView6;
        this.intValue = textView7;
        this.perLabel = textView8;
        this.perValue = textView9;
        this.strLabel = textView10;
        this.strValue = textView11;
        this.twoHandedView = textView12;
    }

    public static GearListItemBinding bind(View view) {
        int i10 = R.id.con_label;
        TextView textView = (TextView) b.a(view, R.id.con_label);
        if (textView != null) {
            i10 = R.id.con_value;
            TextView textView2 = (TextView) b.a(view, R.id.con_value);
            if (textView2 != null) {
                i10 = R.id.equippedIndicator;
                TextView textView3 = (TextView) b.a(view, R.id.equippedIndicator);
                if (textView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i10 = R.id.gear_icon_background_view;
                    FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.gear_icon_background_view);
                    if (frameLayout != null) {
                        i10 = R.id.gear_image;
                        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.gear_image);
                        if (pixelArtView != null) {
                            i10 = R.id.gear_notes;
                            TextView textView4 = (TextView) b.a(view, R.id.gear_notes);
                            if (textView4 != null) {
                                i10 = R.id.gear_text;
                                TextView textView5 = (TextView) b.a(view, R.id.gear_text);
                                if (textView5 != null) {
                                    i10 = R.id.int_label;
                                    TextView textView6 = (TextView) b.a(view, R.id.int_label);
                                    if (textView6 != null) {
                                        i10 = R.id.int_value;
                                        TextView textView7 = (TextView) b.a(view, R.id.int_value);
                                        if (textView7 != null) {
                                            i10 = R.id.per_label;
                                            TextView textView8 = (TextView) b.a(view, R.id.per_label);
                                            if (textView8 != null) {
                                                i10 = R.id.per_value;
                                                TextView textView9 = (TextView) b.a(view, R.id.per_value);
                                                if (textView9 != null) {
                                                    i10 = R.id.str_label;
                                                    TextView textView10 = (TextView) b.a(view, R.id.str_label);
                                                    if (textView10 != null) {
                                                        i10 = R.id.str_value;
                                                        TextView textView11 = (TextView) b.a(view, R.id.str_value);
                                                        if (textView11 != null) {
                                                            i10 = R.id.two_handed_view;
                                                            TextView textView12 = (TextView) b.a(view, R.id.two_handed_view);
                                                            if (textView12 != null) {
                                                                return new GearListItemBinding(linearLayout, textView, textView2, textView3, linearLayout, frameLayout, pixelArtView, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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

    public static GearListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GearListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.gear_list_item, viewGroup, false);
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
