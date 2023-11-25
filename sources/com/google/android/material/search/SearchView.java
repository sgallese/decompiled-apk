package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.p0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.e;
import com.google.android.material.internal.q;
import i.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p7.h;
import v6.k;

/* loaded from: classes3.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b {
    private static final int H = k.f24807q;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private b F;
    private Map<View, Integer> G;

    /* renamed from: f  reason: collision with root package name */
    final ClippableRoundedCornerLayout f10270f;

    /* renamed from: m  reason: collision with root package name */
    final View f10271m;

    /* renamed from: p  reason: collision with root package name */
    final View f10272p;

    /* renamed from: q  reason: collision with root package name */
    final FrameLayout f10273q;

    /* renamed from: r  reason: collision with root package name */
    final MaterialToolbar f10274r;

    /* renamed from: s  reason: collision with root package name */
    final TextView f10275s;

    /* renamed from: t  reason: collision with root package name */
    final EditText f10276t;

    /* renamed from: u  reason: collision with root package name */
    final TouchObserverFrameLayout f10277u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f10278v;

    /* renamed from: w  reason: collision with root package name */
    private final g7.a f10279w;

    /* renamed from: x  reason: collision with root package name */
    private final Set<a> f10280x;

    /* renamed from: y  reason: collision with root package name */
    private SearchBar f10281y;

    /* renamed from: z  reason: collision with root package name */
    private int f10282z;

    /* loaded from: classes3.dex */
    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: E  reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (!searchView.b() && (view instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view);
                return false;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        String f10283p;

        /* renamed from: q  reason: collision with root package name */
        int f10284q;

        /* loaded from: classes3.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f10283p);
            parcel.writeInt(this.f10284q);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10283p = parcel.readString();
            this.f10284q = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes3.dex */
    public interface a {
        void a(SearchView searchView, b bVar, b bVar2);
    }

    /* loaded from: classes3.dex */
    public enum b {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    @SuppressLint({"InlinedApi"})
    private void c(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f10270f.getId()) != null) {
                    c((ViewGroup) childAt, z10);
                } else if (!z10) {
                    Map<View, Integer> map = this.G;
                    if (map != null && map.containsKey(childAt)) {
                        p0.F0(childAt, this.G.get(childAt).intValue());
                    }
                } else {
                    this.G.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    p0.F0(childAt, 4);
                }
            }
        }
    }

    private void d() {
        int i10;
        ImageButton c10 = q.c(this.f10274r);
        if (c10 == null) {
            return;
        }
        if (this.f10270f.getVisibility() == 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        Drawable q10 = androidx.core.graphics.drawable.a.q(c10.getDrawable());
        if (q10 instanceof d) {
            ((d) q10).setProgress(i10);
        }
        if (q10 instanceof e) {
            ((e) q10).a(i10);
        }
    }

    private Window getActivityWindow() {
        Activity a10 = com.google.android.material.internal.b.a(getContext());
        if (a10 == null) {
            return null;
        }
        return a10.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f10281y;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return getResources().getDimension(v6.d.f24696u);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        int i10;
        View view = this.f10272p;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        g7.a aVar = this.f10279w;
        if (aVar != null && this.f10271m != null) {
            this.f10271m.setBackgroundColor(aVar.d(f10));
        }
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            a(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f10273q, false));
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        if (this.f10272p.getLayoutParams().height != i10) {
            this.f10272p.getLayoutParams().height = i10;
            this.f10272p.requestLayout();
        }
    }

    public void a(View view) {
        this.f10273q.addView(view);
        this.f10273q.setVisibility(0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f10278v) {
            this.f10277u.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public boolean b() {
        if (this.f10281y != null) {
            return true;
        }
        return false;
    }

    public void e() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f10282z = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public b getCurrentTransitionState() {
        return this.F;
    }

    public EditText getEditText() {
        return this.f10276t;
    }

    public CharSequence getHint() {
        return this.f10276t.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f10275s;
    }

    public CharSequence getSearchPrefixText() {
        return this.f10275s.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f10282z;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f10276t.getText();
    }

    public Toolbar getToolbar() {
        return this.f10274r;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        boolean z10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setText(savedState.f10283p);
        if (savedState.f10284q == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setVisible(z10);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        String charSequence;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        savedState.f10283p = charSequence;
        savedState.f10284q = this.f10270f.getVisibility();
        return savedState;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.A = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.C = z10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        this.f10276t.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.B = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.G = new HashMap(viewGroup.getChildCount());
        }
        c(viewGroup, z10);
        if (!z10) {
            this.G = null;
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.f10274r.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        int i10;
        this.f10275s.setText(charSequence);
        TextView textView = this.f10275s;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.E = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f10276t.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f10274r.setTouchscreenBlocksFocus(z10);
    }

    void setTransitionState(b bVar) {
        if (this.F.equals(bVar)) {
            return;
        }
        b bVar2 = this.F;
        this.F = bVar;
        Iterator it = new LinkedHashSet(this.f10280x).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this, bVar2, bVar);
        }
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.D = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11;
        b bVar;
        int i10 = 0;
        if (this.f10270f.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f10270f;
        if (!z10) {
            i10 = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i10);
        d();
        if (z11 != z10) {
            setModalForAccessibility(z10);
        }
        if (z10) {
            bVar = b.SHOWN;
        } else {
            bVar = b.HIDDEN;
        }
        setTransitionState(bVar);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f10281y = searchBar;
        throw null;
    }

    public void setHint(int i10) {
        this.f10276t.setHint(i10);
    }

    public void setText(int i10) {
        this.f10276t.setText(i10);
    }
}
