package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.r0;
import androidx.core.view.p0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a  reason: collision with root package name */
    private final Context f683a;

    /* renamed from: b  reason: collision with root package name */
    final x f684b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f685c;

    /* renamed from: d  reason: collision with root package name */
    private final int f686d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f687e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f688f;

    /* renamed from: g  reason: collision with root package name */
    ListView f689g;

    /* renamed from: h  reason: collision with root package name */
    private View f690h;

    /* renamed from: i  reason: collision with root package name */
    private int f691i;

    /* renamed from: j  reason: collision with root package name */
    private int f692j;

    /* renamed from: k  reason: collision with root package name */
    private int f693k;

    /* renamed from: l  reason: collision with root package name */
    private int f694l;

    /* renamed from: m  reason: collision with root package name */
    private int f695m;

    /* renamed from: o  reason: collision with root package name */
    Button f697o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f698p;

    /* renamed from: q  reason: collision with root package name */
    Message f699q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f700r;

    /* renamed from: s  reason: collision with root package name */
    Button f701s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f702t;

    /* renamed from: u  reason: collision with root package name */
    Message f703u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f704v;

    /* renamed from: w  reason: collision with root package name */
    Button f705w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f706x;

    /* renamed from: y  reason: collision with root package name */
    Message f707y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f708z;

    /* renamed from: n  reason: collision with root package name */
    private boolean f696n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: f  reason: collision with root package name */
        private final int f709f;

        /* renamed from: m  reason: collision with root package name */
        private final int f710m;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15887k2);
            this.f710m = obtainStyledAttributes.getDimensionPixelOffset(g.j.f15892l2, -1);
            this.f709f = obtainStyledAttributes.getDimensionPixelOffset(g.j.f15897m2, -1);
        }

        public void a(boolean z10, boolean z11) {
            int i10;
            int i11;
            if (!z11 || !z10) {
                int paddingLeft = getPaddingLeft();
                if (z10) {
                    i10 = getPaddingTop();
                } else {
                    i10 = this.f709f;
                }
                int paddingRight = getPaddingRight();
                if (z11) {
                    i11 = getPaddingBottom();
                } else {
                    i11 = this.f710m;
                }
                setPadding(paddingLeft, i10, paddingRight, i11);
            }
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f697o && (message4 = alertController.f699q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f701s && (message3 = alertController.f703u) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f705w && (message2 = alertController.f707y) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f684b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f712a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f713b;

        b(View view, View view2) {
            this.f712a = view;
            this.f713b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.g(nestedScrollView, this.f712a, this.f713b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f715f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ View f716m;

        c(View view, View view2) {
            this.f715f = view;
            this.f716m = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.f715f, this.f716m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f721f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ View f722m;

        e(View view, View view2) {
            this.f721f = view;
            this.f722m = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f689g, this.f721f, this.f722m);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* renamed from: a  reason: collision with root package name */
        public final Context f724a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f725b;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f727d;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f729f;

        /* renamed from: g  reason: collision with root package name */
        public View f730g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f731h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f732i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f733j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f734k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f735l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f736m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f737n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f738o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f739p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f740q;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f742s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f743t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f744u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f745v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f746w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f747x;

        /* renamed from: y  reason: collision with root package name */
        public int f748y;

        /* renamed from: z  reason: collision with root package name */
        public View f749z;

        /* renamed from: c  reason: collision with root package name */
        public int f726c = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f728e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* renamed from: r  reason: collision with root package name */
        public boolean f741r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ RecycleListView f750f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f750f = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f750f.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: f  reason: collision with root package name */
            private final int f752f;

            /* renamed from: m  reason: collision with root package name */
            private final int f753m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ RecycleListView f754p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ AlertController f755q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f754p = recycleListView;
                this.f755q = alertController;
                Cursor cursor2 = getCursor();
                this.f752f = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f753m = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f752f));
                RecycleListView recycleListView = this.f754p;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f753m) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f725b.inflate(this.f755q.M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ AlertController f757f;

            c(AlertController alertController) {
                this.f757f = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f747x.onClick(this.f757f.f684b, i10);
                if (!f.this.H) {
                    this.f757f.f684b.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ RecycleListView f759f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ AlertController f760m;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f759f = recycleListView;
                this.f760m = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f759f.isItemChecked(i10);
                }
                f.this.J.onClick(this.f760m.f684b, i10, this.f759f.isItemChecked(i10));
            }
        }

        public f(Context context) {
            this.f724a = context;
            this.f725b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            int i10;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f725b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                if (this.K == null) {
                    listAdapter = new a(this.f724a, alertController.M, 16908308, this.f745v, recycleListView);
                } else {
                    listAdapter = new b(this.f724a, this.K, false, recycleListView, alertController);
                }
            } else {
                if (this.H) {
                    i10 = alertController.N;
                } else {
                    i10 = alertController.O;
                }
                int i11 = i10;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f724a, i11, this.K, new String[]{this.L}, new int[]{16908308});
                } else {
                    listAdapter = this.f746w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.f724a, i11, 16908308, this.f745v);
                    }
                }
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.f747x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f689g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f730g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f729f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.f727d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int i10 = this.f726c;
                if (i10 != 0) {
                    alertController.o(i10);
                }
                int i11 = this.f728e;
                if (i11 != 0) {
                    alertController.o(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f731h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            CharSequence charSequence3 = this.f732i;
            if (charSequence3 != null || this.f733j != null) {
                alertController.l(-1, charSequence3, this.f734k, null, this.f733j);
            }
            CharSequence charSequence4 = this.f735l;
            if (charSequence4 != null || this.f736m != null) {
                alertController.l(-2, charSequence4, this.f737n, null, this.f736m);
            }
            CharSequence charSequence5 = this.f738o;
            if (charSequence5 != null || this.f739p != null) {
                alertController.l(-3, charSequence5, this.f740q, null, this.f739p);
            }
            if (this.f745v != null || this.K != null || this.f746w != null) {
                b(alertController);
            }
            View view2 = this.f749z;
            if (view2 != null) {
                if (this.E) {
                    alertController.v(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.u(view2);
                    return;
                }
            }
            int i12 = this.f748y;
            if (i12 != 0) {
                alertController.t(i12);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f762a;

        public g(DialogInterface dialogInterface) {
            this.f762a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != -3 && i10 != -2 && i10 != -1) {
                if (i10 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick(this.f762a.get(), message.what);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, x xVar, Window window) {
        this.f683a = context;
        this.f684b = xVar;
        this.f685c = window;
        this.R = new g(xVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, g.j.F, g.a.f15703n, 0);
        this.J = obtainStyledAttributes.getResourceId(g.j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(g.j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(g.j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(g.j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(g.j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(g.j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(g.j.M, true);
        this.f686d = obtainStyledAttributes.getDimensionPixelSize(g.j.H, 0);
        obtainStyledAttributes.recycle();
        xVar.supportRequestWindowFeature(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A() {
        boolean z10;
        boolean z11;
        boolean z12;
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3;
        View findViewById4 = this.f685c.findViewById(g.f.f15785t);
        int i10 = g.f.P;
        View findViewById5 = findViewById4.findViewById(i10);
        int i11 = g.f.f15778m;
        View findViewById6 = findViewById4.findViewById(i11);
        int i12 = g.f.f15776k;
        View findViewById7 = findViewById4.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById4.findViewById(g.f.f15780o);
        y(viewGroup);
        View findViewById8 = viewGroup.findViewById(i10);
        View findViewById9 = viewGroup.findViewById(i11);
        View findViewById10 = viewGroup.findViewById(i12);
        ViewGroup j10 = j(findViewById8, findViewById5);
        ViewGroup j11 = j(findViewById9, findViewById6);
        ViewGroup j12 = j(findViewById10, findViewById7);
        x(j11);
        w(j12);
        z(j10);
        int i13 = 0;
        if (viewGroup.getVisibility() != 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 != null && j10.getVisibility() != 8) {
            z11 = 1;
        } else {
            z11 = 0;
        }
        if (j12 != null && j12.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && j11 != null && (findViewById3 = j11.findViewById(g.f.K)) != null) {
            findViewById3.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f688f == null && this.f689g == null) {
                findViewById2 = null;
            } else {
                findViewById2 = j10.findViewById(g.f.N);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        } else if (j11 != null && (findViewById = j11.findViewById(g.f.L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f689g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f689g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                if (z12) {
                    i13 = 2;
                }
                r(j11, view, z11 | i13, 3);
            }
        }
        ListView listView2 = this.f689g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i14 = this.I;
            if (i14 > -1) {
                listView2.setItemChecked(i14, true);
                listView2.setSelection(i14);
            }
        }
    }

    private static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(g.a.f15702m, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void g(View view, View view2, View view3) {
        int i10;
        int i11 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view2.setVisibility(i10);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i11 = 4;
            }
            view3.setVisibility(i11);
        }
    }

    private ViewGroup j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int k() {
        int i10 = this.K;
        if (i10 == 0) {
            return this.J;
        }
        if (this.Q == 1) {
            return i10;
        }
        return this.J;
    }

    private void r(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f685c.findViewById(g.f.f15787v);
        View findViewById2 = this.f685c.findViewById(g.f.f15786u);
        if (Build.VERSION.SDK_INT >= 23) {
            p0.N0(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i10 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i10 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f688f != null) {
                this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
                this.A.post(new c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f689g;
            if (listView != null) {
                listView.setOnScrollListener(new d(findViewById, findViewById2));
                this.f689g.post(new e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    private void w(ViewGroup viewGroup) {
        boolean z10;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f697o = button;
        button.setOnClickListener(this.S);
        boolean z11 = true;
        if (TextUtils.isEmpty(this.f698p) && this.f700r == null) {
            this.f697o.setVisibility(8);
            z10 = false;
        } else {
            this.f697o.setText(this.f698p);
            Drawable drawable = this.f700r;
            if (drawable != null) {
                int i10 = this.f686d;
                drawable.setBounds(0, 0, i10, i10);
                this.f697o.setCompoundDrawables(this.f700r, null, null, null);
            }
            this.f697o.setVisibility(0);
            z10 = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f701s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f702t) && this.f704v == null) {
            this.f701s.setVisibility(8);
        } else {
            this.f701s.setText(this.f702t);
            Drawable drawable2 = this.f704v;
            if (drawable2 != null) {
                int i11 = this.f686d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f701s.setCompoundDrawables(this.f704v, null, null, null);
            }
            this.f701s.setVisibility(0);
            z10 |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f705w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f706x) && this.f708z == null) {
            this.f705w.setVisibility(8);
        } else {
            this.f705w.setText(this.f706x);
            Drawable drawable3 = this.f708z;
            if (drawable3 != null) {
                int i12 = this.f686d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f705w.setCompoundDrawables(this.f708z, null, null, null);
            }
            this.f705w.setVisibility(0);
            z10 |= true;
        }
        if (B(this.f683a)) {
            if (z10) {
                b(this.f697o);
            } else if (z10) {
                b(this.f701s);
            } else if (z10) {
                b(this.f705w);
            }
        }
        if (!z10) {
            z11 = false;
        }
        if (!z11) {
            viewGroup.setVisibility(8);
        }
    }

    private void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f685c.findViewById(g.f.f15788w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f688f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f689g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f689g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void y(ViewGroup viewGroup) {
        View view = this.f690h;
        boolean z10 = false;
        if (view == null) {
            if (this.f691i != 0) {
                view = LayoutInflater.from(this.f683a).inflate(this.f691i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z10 = true;
        }
        if (!z10 || !a(view)) {
            this.f685c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f685c.findViewById(g.f.f15779n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f696n) {
                frameLayout.setPadding(this.f692j, this.f693k, this.f694l, this.f695m);
            }
            if (this.f689g != null) {
                ((LinearLayout.LayoutParams) ((r0.a) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void z(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f685c.findViewById(g.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f685c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f687e)) != false && this.P) {
            TextView textView = (TextView) this.f685c.findViewById(g.f.f15775j);
            this.E = textView;
            textView.setText(this.f687e);
            int i10 = this.B;
            if (i10 != 0) {
                this.D.setImageResource(i10);
                return;
            }
            Drawable drawable = this.C;
            if (drawable != null) {
                this.D.setImageDrawable(drawable);
                return;
            }
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
            return;
        }
        this.f685c.findViewById(g.f.O).setVisibility(8);
        this.D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    public Button c(int i10) {
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 != -1) {
                    return null;
                }
                return this.f697o;
            }
            return this.f701s;
        }
        return this.f705w;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f683a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f689g;
    }

    public void f() {
        this.f684b.setContentView(k());
        A();
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        if (nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean i(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        if (nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public void l(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 == -1) {
                    this.f698p = charSequence;
                    this.f699q = message;
                    this.f700r = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f702t = charSequence;
            this.f703u = message;
            this.f704v = drawable;
            return;
        }
        this.f706x = charSequence;
        this.f707y = message;
        this.f708z = drawable;
    }

    public void m(int i10) {
        this.Q = i10;
    }

    public void n(View view) {
        this.G = view;
    }

    public void o(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 != 0) {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void p(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void q(CharSequence charSequence) {
        this.f688f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(CharSequence charSequence) {
        this.f687e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int i10) {
        this.f690h = null;
        this.f691i = i10;
        this.f696n = false;
    }

    public void u(View view) {
        this.f690h = view;
        this.f691i = 0;
        this.f696n = false;
    }

    public void v(View view, int i10, int i11, int i12, int i13) {
        this.f690h = view;
        this.f691i = 0;
        this.f696n = true;
        this.f692j = i10;
        this.f693k = i11;
        this.f694l = i12;
        this.f695m = i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f718a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f719b;

        d(View view, View view2) {
            this.f718a = view;
            this.f719b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.g(absListView, this.f718a, this.f719b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }
}
