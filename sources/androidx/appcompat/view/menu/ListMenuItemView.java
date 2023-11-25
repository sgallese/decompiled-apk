package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.g1;
import androidx.core.view.p0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    private Drawable A;
    private boolean B;
    private LayoutInflater C;
    private boolean D;

    /* renamed from: f  reason: collision with root package name */
    private i f1027f;

    /* renamed from: m  reason: collision with root package name */
    private ImageView f1028m;

    /* renamed from: p  reason: collision with root package name */
    private RadioButton f1029p;

    /* renamed from: q  reason: collision with root package name */
    private TextView f1030q;

    /* renamed from: r  reason: collision with root package name */
    private CheckBox f1031r;

    /* renamed from: s  reason: collision with root package name */
    private TextView f1032s;

    /* renamed from: t  reason: collision with root package name */
    private ImageView f1033t;

    /* renamed from: u  reason: collision with root package name */
    private ImageView f1034u;

    /* renamed from: v  reason: collision with root package name */
    private LinearLayout f1035v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f1036w;

    /* renamed from: x  reason: collision with root package name */
    private int f1037x;

    /* renamed from: y  reason: collision with root package name */
    private Context f1038y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1039z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.F);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f1035v;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.g.f15799h, (ViewGroup) this, false);
        this.f1031r = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.g.f15800i, (ViewGroup) this, false);
        this.f1028m = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.g.f15802k, (ViewGroup) this, false);
        this.f1029p = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.C == null) {
            this.C = LayoutInflater.from(getContext());
        }
        return this.C;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f1033t;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1034u;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1034u.getLayoutParams();
            rect.top += this.f1034u.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i10) {
        int i11;
        this.f1027f = iVar;
        if (iVar.isVisible()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f1027f;
    }

    public void h(boolean z10, char c10) {
        int i10;
        if (z10 && this.f1027f.A()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (i10 == 0) {
            this.f1032s.setText(this.f1027f.h());
        }
        if (this.f1032s.getVisibility() != i10) {
            this.f1032s.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        p0.y0(this, this.f1036w);
        TextView textView = (TextView) findViewById(g.f.M);
        this.f1030q = textView;
        int i10 = this.f1037x;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1038y, i10);
        }
        this.f1032s = (TextView) findViewById(g.f.F);
        ImageView imageView = (ImageView) findViewById(g.f.I);
        this.f1033t = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A);
        }
        this.f1034u = (ImageView) findViewById(g.f.f15783r);
        this.f1035v = (LinearLayout) findViewById(g.f.f15777l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f1028m != null && this.f1039z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1028m.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f1029p == null && this.f1031r == null) {
            return;
        }
        if (this.f1027f.m()) {
            if (this.f1029p == null) {
                g();
            }
            compoundButton = this.f1029p;
            view = this.f1031r;
        } else {
            if (this.f1031r == null) {
                c();
            }
            compoundButton = this.f1031r;
            view = this.f1029p;
        }
        if (z10) {
            compoundButton.setChecked(this.f1027f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox = this.f1031r;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1029p;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f1027f.m()) {
            if (this.f1029p == null) {
                g();
            }
            compoundButton = this.f1029p;
        } else {
            if (this.f1031r == null) {
                c();
            }
            compoundButton = this.f1031r;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.D = z10;
        this.f1039z = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i10;
        ImageView imageView = this.f1034u;
        if (imageView != null) {
            if (!this.B && z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10;
        if (!this.f1027f.z() && !this.D) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !this.f1039z) {
            return;
        }
        ImageView imageView = this.f1028m;
        if (imageView == null && drawable == null && !this.f1039z) {
            return;
        }
        if (imageView == null) {
            f();
        }
        if (drawable == null && !this.f1039z) {
            this.f1028m.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.f1028m;
        if (!z10) {
            drawable = null;
        }
        imageView2.setImageDrawable(drawable);
        if (this.f1028m.getVisibility() != 0) {
            this.f1028m.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1030q.setText(charSequence);
            if (this.f1030q.getVisibility() != 0) {
                this.f1030q.setVisibility(0);
            }
        } else if (this.f1030q.getVisibility() != 8) {
            this.f1030q.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        g1 v10 = g1.v(getContext(), attributeSet, g.j.f15841b2, i10, 0);
        this.f1036w = v10.g(g.j.f15852d2);
        this.f1037x = v10.n(g.j.f15847c2, -1);
        this.f1039z = v10.a(g.j.f15857e2, false);
        this.f1038y = context;
        this.A = v10.g(g.j.f15862f2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, g.a.B, 0);
        this.B = obtainStyledAttributes.hasValue(0);
        v10.w();
        obtainStyledAttributes.recycle();
    }
}
