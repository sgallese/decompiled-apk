package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ViewCollapsibleSectionBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import ec.h0;
import ec.u;
import java.util.ArrayList;
import java.util.Iterator;
import qc.q;

/* compiled from: CollapsibleSectionView.kt */
/* loaded from: classes4.dex */
public final class CollapsibleSectionView extends LinearLayout {
    public static final int $stable = 8;
    private final ViewCollapsibleSectionBinding binding;
    private final int bottomPadding;
    private int caretColor;
    private String identifier;
    private boolean isCollapsed;
    private final int padding;
    private SharedPreferences preferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsibleSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        int i11;
        TypedArray typedArray;
        String str;
        String str2;
        q.i(context, "context");
        ViewCollapsibleSectionBinding inflate = ViewCollapsibleSectionBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        Resources resources = context.getResources();
        boolean z10 = false;
        if (resources != null) {
            i10 = (int) resources.getDimension(R.dimen.spacing_large);
        } else {
            i10 = 0;
        }
        this.padding = i10;
        Resources resources2 = context.getResources();
        if (resources2 != null) {
            i11 = (int) resources2.getDimension(R.dimen.collapsible_section_padding);
        } else {
            i11 = 0;
        }
        this.bottomPadding = i11;
        setCaretColor(androidx.core.content.a.c(context, R.color.black_50_alpha));
        setOrientation(1);
        inflate.sectionTitleView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleSectionView._init_$lambda$11(CollapsibleSectionView.this, view);
            }
        });
        Resources.Theme theme = context.getTheme();
        if (theme != null) {
            typedArray = theme.obtainStyledAttributes(attributeSet, R.styleable.CollapsibleSectionView, 0, 0);
        } else {
            typedArray = null;
        }
        if (typedArray != null) {
            str = typedArray.getString(3);
        } else {
            str = null;
        }
        setTitle(str == null ? "" : str);
        if (typedArray != null) {
            str2 = typedArray.getString(2);
        } else {
            str2 = null;
        }
        this.identifier = str2;
        Integer valueOf = typedArray != null ? Integer.valueOf(typedArray.getColor(0, 0)) : null;
        if (valueOf != null && valueOf.intValue() != 0) {
            setCaretColor(valueOf.intValue());
            inflate.titleTextView.setTextColor(valueOf.intValue());
        }
        if (typedArray != null && typedArray.getBoolean(1, false)) {
            z10 = true;
        }
        if (z10) {
            inflate.infoIconView.setImageBitmap(HabiticaIconsHelper.imageOfInfoIcon(ContextExtensionsKt.getThemeColor(context, R.attr.colorPrimaryOffset)));
        } else {
            inflate.infoIconView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$11(CollapsibleSectionView collapsibleSectionView, View view) {
        q.i(collapsibleSectionView, "this$0");
        collapsibleSectionView.setCollapsed(!collapsibleSectionView.isCollapsed);
    }

    private final void hideViews() {
        vc.f s10;
        int s11;
        updatePreferences();
        setCaretImage();
        s10 = vc.l.s(0, getChildCount());
        s11 = u.s(s10, 10);
        ArrayList arrayList = new ArrayList(s11);
        Iterator<Integer> it = s10.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((h0) it).a()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if ((!q.d((View) obj, this.binding.sectionTitleView)) != false) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(8);
        }
    }

    private final void setCaretImage() {
        this.binding.caretView.setImageBitmap(HabiticaIconsHelper.imageOfCaret(this.caretColor, this.isCollapsed));
    }

    private final void setChildMargins() {
        vc.f s10;
        int s11;
        LinearLayout.LayoutParams layoutParams;
        s10 = vc.l.s(0, getChildCount());
        s11 = u.s(s10, 10);
        ArrayList arrayList = new ArrayList(s11);
        Iterator<Integer> it = s10.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((h0) it).a()));
        }
        ArrayList<View> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if ((!q.d((View) obj, this.binding.sectionTitleView)) != false) {
                arrayList2.add(obj);
            }
        }
        for (View view : arrayList2) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                int i10 = this.padding;
                layoutParams.setMargins(i10, 0, i10, this.bottomPadding);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    private final void setCollapsed(boolean z10) {
        this.isCollapsed = z10;
        if (z10) {
            hideViews();
        } else {
            showViews();
        }
    }

    private final void showViews() {
        vc.f s10;
        int s11;
        updatePreferences();
        setCaretImage();
        s10 = vc.l.s(0, getChildCount());
        s11 = u.s(s10, 10);
        ArrayList arrayList = new ArrayList(s11);
        Iterator<Integer> it = s10.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((h0) it).a()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(0);
        }
    }

    private final void updatePreferences() {
        SharedPreferences sharedPreferences;
        if (this.identifier != null && (sharedPreferences = this.preferences) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(this.identifier, this.isCollapsed);
            edit.apply();
        }
    }

    public final int getCaretColor() {
        return this.caretColor;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final ImageView getInfoIconView() {
        ImageView imageView = this.binding.infoIconView;
        q.h(imageView, "infoIconView");
        return imageView;
    }

    public final CharSequence getTitle() {
        CharSequence text = this.binding.titleTextView.getText();
        q.h(text, "getText(...)");
        return text;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCaretImage();
        setChildMargins();
        boolean z10 = false;
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("collapsible_sections", 0);
        this.preferences = sharedPreferences;
        String str = this.identifier;
        if (str != null) {
            if (sharedPreferences != null && sharedPreferences.getBoolean(str, false)) {
                z10 = true;
            }
            if (z10) {
                setCollapsed(true);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        setChildMargins();
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        vc.f s10;
        int s11;
        measureChildWithMargins(this.binding.sectionTitleView, i10, 0, i11, 0);
        int measuredHeight = this.binding.sectionTitleView.getMeasuredHeight() + 0;
        s10 = vc.l.s(1, getChildCount());
        s11 = u.s(s10, 10);
        ArrayList<View> arrayList = new ArrayList(s11);
        Iterator<Integer> it = s10.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((h0) it).a()));
        }
        for (View view : arrayList) {
            if (view.getVisibility() != 8) {
                measureChildWithMargins(view, i10, 0, i11, measuredHeight);
                measuredHeight += view.getMeasuredHeight() + this.bottomPadding;
            }
        }
        if (!this.isCollapsed) {
            measuredHeight += this.padding;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), measuredHeight);
    }

    public final void setCaretColor(int i10) {
        this.caretColor = i10;
        setCaretImage();
    }

    public final void setCaretOffset(int i10) {
        this.binding.caretView.setPadding(0, 0, i10, 0);
    }

    public final void setIdentifier(String str) {
        this.identifier = str;
    }

    public final void setTitle(CharSequence charSequence) {
        q.i(charSequence, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.binding.titleTextView.setText(charSequence);
    }
}
