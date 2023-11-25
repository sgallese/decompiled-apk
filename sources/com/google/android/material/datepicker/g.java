package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.n0;
import androidx.core.view.h0;
import androidx.core.view.p0;
import androidx.core.view.p1;
import androidx.fragment.app.k0;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes3.dex */
public final class g<S> extends androidx.fragment.app.k {
    static final Object N = "CONFIRM_BUTTON_TAG";
    static final Object O = "CANCEL_BUTTON_TAG";
    static final Object P = "TOGGLE_BUTTON_TAG";
    private int A;
    private int B;
    private CharSequence C;
    private int D;
    private CharSequence E;
    private TextView F;
    private TextView G;
    private CheckableImageButton H;
    private p7.g I;
    private Button J;
    private boolean K;
    private CharSequence L;
    private CharSequence M;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedHashSet<h<? super S>> f9950f = new LinkedHashSet<>();

    /* renamed from: m  reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f9951m = new LinkedHashSet<>();

    /* renamed from: p  reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f9952p = new LinkedHashSet<>();

    /* renamed from: q  reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f9953q = new LinkedHashSet<>();

    /* renamed from: r  reason: collision with root package name */
    private int f9954r;

    /* renamed from: s  reason: collision with root package name */
    private DateSelector<S> f9955s;

    /* renamed from: t  reason: collision with root package name */
    private m<S> f9956t;

    /* renamed from: u  reason: collision with root package name */
    private CalendarConstraints f9957u;

    /* renamed from: v  reason: collision with root package name */
    private DayViewDecorator f9958v;

    /* renamed from: w  reason: collision with root package name */
    private com.google.android.material.datepicker.f<S> f9959w;

    /* renamed from: x  reason: collision with root package name */
    private int f9960x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f9961y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f9962z;

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = g.this.f9950f.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(g.this.p());
            }
            g.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            super.g(view, n0Var);
            n0Var.r0(g.this.k().V0() + ", " + ((Object) n0Var.C()));
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = g.this.f9951m.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            g.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    public class d implements h0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f9967b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9968c;

        d(int i10, View view, int i11) {
            this.f9966a = i10;
            this.f9967b = view;
            this.f9968c = i11;
        }

        @Override // androidx.core.view.h0
        public p1 a(View view, p1 p1Var) {
            int i10 = p1Var.f(p1.m.d()).f3873b;
            if (this.f9966a >= 0) {
                this.f9967b.getLayoutParams().height = this.f9966a + i10;
                View view2 = this.f9967b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f9967b;
            view3.setPadding(view3.getPaddingLeft(), this.f9968c + i10, this.f9967b.getPaddingRight(), this.f9967b.getPaddingBottom());
            return p1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    public class e extends l<S> {
        e() {
        }

        @Override // com.google.android.material.datepicker.l
        public void a(S s10) {
            g gVar = g.this;
            gVar.x(gVar.n());
            g.this.J.setEnabled(g.this.k().s0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.J.setEnabled(g.this.k().s0());
            g.this.H.toggle();
            g gVar = g.this;
            gVar.z(gVar.H);
            g.this.w();
        }
    }

    private static Drawable i(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, h.a.b(context, v6.e.f24703b));
        stateListDrawable.addState(new int[0], h.a.b(context, v6.e.f24704c));
        return stateListDrawable;
    }

    private void j(Window window) {
        if (this.K) {
            return;
        }
        View findViewById = requireView().findViewById(v6.f.f24720i);
        com.google.android.material.internal.d.a(window, true, com.google.android.material.internal.r.d(findViewById), null);
        p0.J0(findViewById, new d(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.K = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector<S> k() {
        if (this.f9955s == null) {
            this.f9955s = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f9955s;
    }

    private static CharSequence l(CharSequence charSequence) {
        if (charSequence != null) {
            String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                return split[0];
            }
            return charSequence;
        }
        return null;
    }

    private String m() {
        return k().i0(requireContext());
    }

    private static int o(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(v6.d.Q);
        int i10 = Month.g().f9899q;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(v6.d.S) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(v6.d.V));
    }

    private int q(Context context) {
        int i10 = this.f9954r;
        if (i10 != 0) {
            return i10;
        }
        return k().l0(context);
    }

    private void r(Context context) {
        boolean z10;
        this.H.setTag(P);
        this.H.setImageDrawable(i(context));
        CheckableImageButton checkableImageButton = this.H;
        if (this.A != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        checkableImageButton.setChecked(z10);
        p0.u0(this.H, null);
        z(this.H);
        this.H.setOnClickListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(Context context) {
        return v(context, 16843277);
    }

    private boolean t() {
        if (getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u(Context context) {
        return v(context, v6.b.R);
    }

    static boolean v(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(m7.b.d(context, v6.b.A, com.google.android.material.datepicker.f.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        m<S> mVar;
        int q10 = q(requireContext());
        this.f9959w = com.google.android.material.datepicker.f.t(k(), q10, this.f9957u, this.f9958v);
        boolean isChecked = this.H.isChecked();
        if (isChecked) {
            mVar = i.d(k(), q10, this.f9957u);
        } else {
            mVar = this.f9959w;
        }
        this.f9956t = mVar;
        y(isChecked);
        x(n());
        k0 q11 = getChildFragmentManager().q();
        q11.s(v6.f.A, this.f9956t);
        q11.l();
        this.f9956t.b(new e());
    }

    private void y(boolean z10) {
        CharSequence charSequence;
        TextView textView = this.F;
        if (z10 && t()) {
            charSequence = this.M;
        } else {
            charSequence = this.L;
        }
        textView.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(CheckableImageButton checkableImageButton) {
        String string;
        if (this.H.isChecked()) {
            string = checkableImageButton.getContext().getString(v6.j.f24786v);
        } else {
            string = checkableImageButton.getContext().getString(v6.j.f24788x);
        }
        this.H.setContentDescription(string);
    }

    public String n() {
        return k().j(getContext());
    }

    @Override // androidx.fragment.app.k, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f9952p.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f9954r = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f9955s = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9957u = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9958v = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f9960x = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f9961y = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.A = bundle.getInt("INPUT_MODE_KEY");
        this.B = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.C = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.D = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.E = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f9961y;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f9960x);
        }
        this.L = charSequence;
        this.M = l(charSequence);
    }

    @Override // androidx.fragment.app.k
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), q(requireContext()));
        Context context = dialog.getContext();
        this.f9962z = s(context);
        int d10 = m7.b.d(context, v6.b.f24647q, g.class.getCanonicalName());
        p7.g gVar = new p7.g(context, null, v6.b.A, v6.k.E);
        this.I = gVar;
        gVar.Q(context);
        this.I.b0(ColorStateList.valueOf(d10));
        this.I.a0(p0.y(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        if (this.f9962z) {
            i10 = v6.h.f24763w;
        } else {
            i10 = v6.h.f24762v;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.f9958v;
        if (dayViewDecorator != null) {
            dayViewDecorator.g(context);
        }
        if (this.f9962z) {
            inflate.findViewById(v6.f.A).setLayoutParams(new LinearLayout.LayoutParams(o(context), -2));
        } else {
            inflate.findViewById(v6.f.B).setLayoutParams(new LinearLayout.LayoutParams(o(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(v6.f.H);
        this.G = textView;
        p0.w0(textView, 1);
        this.H = (CheckableImageButton) inflate.findViewById(v6.f.I);
        this.F = (TextView) inflate.findViewById(v6.f.J);
        r(context);
        this.J = (Button) inflate.findViewById(v6.f.f24715d);
        if (k().s0()) {
            this.J.setEnabled(true);
        } else {
            this.J.setEnabled(false);
        }
        this.J.setTag(N);
        CharSequence charSequence = this.C;
        if (charSequence != null) {
            this.J.setText(charSequence);
        } else {
            int i11 = this.B;
            if (i11 != 0) {
                this.J.setText(i11);
            }
        }
        this.J.setOnClickListener(new a());
        p0.u0(this.J, new b());
        Button button = (Button) inflate.findViewById(v6.f.f24712a);
        button.setTag(O);
        CharSequence charSequence2 = this.E;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i12 = this.D;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        button.setOnClickListener(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f9953q.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Month o10;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f9954r);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9955s);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f9957u);
        com.google.android.material.datepicker.f<S> fVar = this.f9959w;
        if (fVar == null) {
            o10 = null;
        } else {
            o10 = fVar.o();
        }
        if (o10 != null) {
            bVar.b(o10.f9901s);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f9958v);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f9960x);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f9961y);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.B);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.C);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.D);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.E);
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f9962z) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.I);
            j(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(v6.d.U);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.I, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new e7.a(requireDialog(), rect));
        }
        w();
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onStop() {
        this.f9956t.c();
        super.onStop();
    }

    public final S p() {
        return k().C0();
    }

    void x(String str) {
        this.G.setContentDescription(m());
        this.G.setText(str);
    }
}
