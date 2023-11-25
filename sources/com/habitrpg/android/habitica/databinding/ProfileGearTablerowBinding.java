package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ProfileGearTablerowBinding implements a {
    public final PixelArtView gearDrawee;
    private final TableRow rootView;
    public final TextView tableRowTextView1;
    public final TextView tableRowTextView2;

    private ProfileGearTablerowBinding(TableRow tableRow, PixelArtView pixelArtView, TextView textView, TextView textView2) {
        this.rootView = tableRow;
        this.gearDrawee = pixelArtView;
        this.tableRowTextView1 = textView;
        this.tableRowTextView2 = textView2;
    }

    public static ProfileGearTablerowBinding bind(View view) {
        int i10 = R.id.gear_drawee;
        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.gear_drawee);
        if (pixelArtView != null) {
            i10 = R.id.tableRowTextView1;
            TextView textView = (TextView) b.a(view, R.id.tableRowTextView1);
            if (textView != null) {
                i10 = R.id.tableRowTextView2;
                TextView textView2 = (TextView) b.a(view, R.id.tableRowTextView2);
                if (textView2 != null) {
                    return new ProfileGearTablerowBinding((TableRow) view, pixelArtView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ProfileGearTablerowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ProfileGearTablerowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.profile_gear_tablerow, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public TableRow getRoot() {
        return this.rootView;
    }
}
