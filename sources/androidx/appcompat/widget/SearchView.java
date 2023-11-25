package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends r0 implements androidx.appcompat.view.c {
    static final o B0;
    private TextWatcher A0;
    final SearchAutoComplete C;
    private final View D;
    private final View E;
    private final View F;
    final ImageView G;
    final ImageView H;
    final ImageView I;
    final ImageView J;
    private final View K;
    private p L;
    private Rect M;
    private Rect N;
    private int[] O;
    private int[] P;
    private final ImageView Q;
    private final Drawable R;
    private final int S;
    private final int T;
    private final Intent U;
    private final Intent V;
    private final CharSequence W;

    /* renamed from: a0  reason: collision with root package name */
    private m f1299a0;

    /* renamed from: b0  reason: collision with root package name */
    View.OnFocusChangeListener f1300b0;

    /* renamed from: c0  reason: collision with root package name */
    private View.OnClickListener f1301c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f1302d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f1303e0;

    /* renamed from: f0  reason: collision with root package name */
    w2.a f1304f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f1305g0;

    /* renamed from: h0  reason: collision with root package name */
    private CharSequence f1306h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f1307i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f1308j0;

    /* renamed from: k0  reason: collision with root package name */
    private int f1309k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f1310l0;

    /* renamed from: m0  reason: collision with root package name */
    private CharSequence f1311m0;

    /* renamed from: n0  reason: collision with root package name */
    private CharSequence f1312n0;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f1313o0;

    /* renamed from: p0  reason: collision with root package name */
    private int f1314p0;

    /* renamed from: q0  reason: collision with root package name */
    SearchableInfo f1315q0;

    /* renamed from: r0  reason: collision with root package name */
    private Bundle f1316r0;

    /* renamed from: s0  reason: collision with root package name */
    private final Runnable f1317s0;

    /* renamed from: t0  reason: collision with root package name */
    private Runnable f1318t0;

    /* renamed from: u0  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1319u0;

    /* renamed from: v0  reason: collision with root package name */
    private final View.OnClickListener f1320v0;

    /* renamed from: w0  reason: collision with root package name */
    View.OnKeyListener f1321w0;

    /* renamed from: x0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f1322x0;

    /* renamed from: y0  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1323y0;

    /* renamed from: z0  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1324z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        boolean f1325p;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1325p + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1325p));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1325p = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: r  reason: collision with root package name */
        private int f1326r;

        /* renamed from: s  reason: collision with root package name */
        private SearchView f1327s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f1328t;

        /* renamed from: u  reason: collision with root package name */
        final Runnable f1329u;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, g.a.f15705p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            if (i10 < 600) {
                if (i10 < 640 || i11 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.B0.c(this);
        }

        boolean c() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        void d() {
            if (this.f1328t) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1328t = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            if (this.f1326r > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1328t) {
                removeCallbacks(this.f1329u);
                post(this.f1329u);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1327s.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1327s.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1327s.hasFocus() && getVisibility() == 0) {
                this.f1328t = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1328t = false;
                removeCallbacks(this.f1329u);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1328t = false;
                removeCallbacks(this.f1329u);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1328t = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1327s = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1326r = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1329u = new a();
            this.f1326r = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w2.a aVar = SearchView.this.f1304f0;
            if (aVar instanceof a1) {
                aVar.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1300b0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.G) {
                searchView.V();
            } else if (view == searchView.I) {
                searchView.R();
            } else if (view == searchView.H) {
                searchView.W();
            } else if (view == searchView.J) {
                searchView.a0();
            } else if (view == searchView.C) {
                searchView.H();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1315q0 == null) {
                return false;
            }
            if (searchView.C.isPopupShowing() && SearchView.this.C.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (SearchView.this.C.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.C.getText().toString());
            return true;
        }
    }

    /* loaded from: classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* loaded from: classes.dex */
    public interface n {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        private Method f1341a;

        /* renamed from: b  reason: collision with root package name */
        private Method f1342b;

        /* renamed from: c  reason: collision with root package name */
        private Method f1343c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        o() {
            this.f1341a = null;
            this.f1342b = null;
            this.f1343c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1341a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1342b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1343c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1342b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1341a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1343c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f1344a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1345b;

        /* renamed from: c  reason: collision with root package name */
        private final Rect f1346c;

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1347d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1348e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1349f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1348e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1345b = new Rect();
            this.f1347d = new Rect();
            this.f1346c = new Rect();
            a(rect, rect2);
            this.f1344a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1345b.set(rect);
            this.f1347d.set(rect);
            Rect rect3 = this.f1347d;
            int i10 = this.f1348e;
            rect3.inset(-i10, -i10);
            this.f1346c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z11 = this.f1349f;
                        this.f1349f = false;
                    }
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f1349f;
                    if (z11 && !this.f1347d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1345b.contains(x10, y10)) {
                    this.f1349f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (z10 && !this.f1346c.contains(x10, y10)) {
                motionEvent.setLocation(this.f1344a.getWidth() / 2, this.f1344a.getHeight() / 2);
            } else {
                Rect rect = this.f1346c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            }
            return this.f1344a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        B0 = oVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1312n0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1316r0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1315q0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int i11;
        Uri parse;
        String o10;
        try {
            String o11 = a1.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f1315q0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = a1.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f1315q0.getSuggestIntentData();
            }
            if (o12 != null && (o10 = a1.o(cursor, "suggest_intent_data_id")) != null) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            if (o12 == null) {
                parse = null;
            } else {
                parse = Uri.parse(o12);
            }
            return C(str2, parse, a1.o(cursor, "suggest_intent_extra_data"), a1.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i10;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1316r0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        } else {
            i10 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        String flattenToShortString;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            flattenToShortString = null;
        } else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }

    private void G() {
        this.C.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.O);
        getLocationInWindow(this.P);
        int[] iArr = this.O;
        int i10 = iArr[1];
        int[] iArr2 = this.P;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (this.f1302d0 && this.R != null) {
            int textSize = (int) (this.C.getTextSize() * 1.25d);
            this.R.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.R), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    private boolean K() {
        Intent intent;
        SearchableInfo searchableInfo = this.f1315q0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f1315q0.getVoiceSearchLaunchWebSearch()) {
            intent = this.U;
        } else if (this.f1315q0.getVoiceSearchLaunchRecognizer()) {
            intent = this.V;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    static boolean M(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private boolean N() {
        if ((this.f1305g0 || this.f1310l0) && !L()) {
            return true;
        }
        return false;
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor b10 = this.f1304f0.b();
        if (b10 != null && b10.moveToPosition(i10)) {
            O(D(b10, i11, str));
            return true;
        }
        return false;
    }

    private void b0() {
        post(this.f1317s0);
    }

    private void c0(int i10) {
        Editable text = this.C.getText();
        Cursor b10 = this.f1304f0.b();
        if (b10 == null) {
            return;
        }
        if (b10.moveToPosition(i10)) {
            CharSequence c10 = this.f1304f0.c(b10);
            if (c10 != null) {
                setQuery(c10);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    private void e0() {
        int[] iArr;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.C.getText());
        int i10 = 0;
        if (!z11 && (!this.f1302d0 || this.f1313o0)) {
            z10 = false;
        }
        ImageView imageView = this.I;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.I.getDrawable();
        if (drawable != null) {
            if (z11) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.C;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(g.d.f15731g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(g.d.f15732h);
    }

    private void h0() {
        this.C.setThreshold(this.f1315q0.getSuggestThreshold());
        this.C.setImeOptions(this.f1315q0.getImeOptions());
        int inputType = this.f1315q0.getInputType();
        int i10 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1315q0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.C.setInputType(inputType);
        w2.a aVar = this.f1304f0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f1315q0.getSuggestAuthority() != null) {
            a1 a1Var = new a1(getContext(), this, this.f1315q0, this.f1319u0);
            this.f1304f0 = a1Var;
            this.C.setAdapter(a1Var);
            a1 a1Var2 = (a1) this.f1304f0;
            if (this.f1307i0) {
                i10 = 2;
            }
            a1Var2.x(i10);
        }
    }

    private void i0() {
        int i10;
        if (N() && (this.H.getVisibility() == 0 || this.J.getVisibility() == 0)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.F.setVisibility(i10);
    }

    private void j0(boolean z10) {
        int i10;
        if (this.f1305g0 && N() && hasFocus() && (z10 || !this.f1310l0)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.H.setVisibility(i10);
    }

    private void k0(boolean z10) {
        int i10;
        int i11;
        this.f1303e0 = z10;
        int i12 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z11 = !TextUtils.isEmpty(this.C.getText());
        this.G.setVisibility(i10);
        j0(z11);
        View view = this.D;
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        if (this.Q.getDrawable() == null || this.f1302d0) {
            i12 = 8;
        }
        this.Q.setVisibility(i12);
        e0();
        l0(!z11);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.f1310l0 && !L() && z10) {
            this.H.setVisibility(8);
            i10 = 0;
        }
        this.J.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        this.C.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.C;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    void B() {
        int i10;
        int i11;
        if (this.K.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.E.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = r1.b(this);
            if (this.f1302d0) {
                i10 = resources.getDimensionPixelSize(g.d.f15729e) + resources.getDimensionPixelSize(g.d.f15730f);
            } else {
                i10 = 0;
            }
            this.C.getDropDownBackground().getPadding(rect);
            if (b10) {
                i11 = -rect.left;
            } else {
                i11 = paddingLeft - (rect.left + i10);
            }
            this.C.setDropDownHorizontalOffset(i11);
            this.C.setDropDownWidth((((this.K.getWidth() + rect.left) + rect.right) + i10) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.C);
            return;
        }
        o oVar = B0;
        oVar.b(this.C);
        oVar.a(this.C);
    }

    public boolean L() {
        return this.f1303e0;
    }

    void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void R() {
        if (TextUtils.isEmpty(this.C.getText())) {
            if (this.f1302d0) {
                clearFocus();
                k0(true);
                return;
            }
            return;
        }
        this.C.setText("");
        this.C.requestFocus();
        this.C.setImeVisibility(true);
    }

    boolean S(int i10, int i11, String str) {
        Q(i10, 0, null);
        this.C.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i10) {
        c0(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.C.requestFocus();
        this.C.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1301c0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.C.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.f1299a0;
            if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
                if (this.f1315q0 != null) {
                    P(0, null, text.toString());
                }
                this.C.setImeVisibility(false);
                G();
            }
        }
    }

    boolean X(View view, int i10, KeyEvent keyEvent) {
        int length;
        if (this.f1315q0 != null && this.f1304f0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 != 66 && i10 != 84 && i10 != 61) {
                if (i10 != 21 && i10 != 22) {
                    if (i10 == 19) {
                        this.C.getListSelection();
                        return false;
                    }
                } else {
                    if (i10 == 21) {
                        length = 0;
                    } else {
                        length = this.C.length();
                    }
                    this.C.setSelection(length);
                    this.C.setListSelection(0);
                    this.C.clearListSelection();
                    this.C.b();
                    return true;
                }
            } else {
                return S(this.C.getListSelection(), 0, null);
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.C.getText();
        this.f1312n0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        j0(z10);
        l0(!z10);
        e0();
        i0();
        if (this.f1299a0 != null && !TextUtils.equals(charSequence, this.f1311m0)) {
            this.f1299a0.onQueryTextChange(charSequence.toString());
        }
        this.f1311m0 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.C.hasFocus()) {
            H();
        }
    }

    void a0() {
        SearchableInfo searchableInfo = this.f1315q0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.U, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.V, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f1313o0) {
            return;
        }
        this.f1313o0 = true;
        int imeOptions = this.C.getImeOptions();
        this.f1314p0 = imeOptions;
        this.C.setImeOptions(imeOptions | 33554432);
        this.C.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1308j0 = true;
        super.clearFocus();
        this.C.clearFocus();
        this.C.setImeVisibility(false);
        this.f1308j0 = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.C.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.C;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1312n0 = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    @Override // androidx.appcompat.view.c
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.C.setImeOptions(this.f1314p0);
        this.f1313o0 = false;
    }

    void f0() {
        int[] iArr;
        if (this.C.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.F.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.C.getImeOptions();
    }

    public int getInputType() {
        return this.C.getInputType();
    }

    public int getMaxWidth() {
        return this.f1309k0;
    }

    public CharSequence getQuery() {
        return this.C.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1306h0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f1315q0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f1315q0.getHintId());
            }
            return this.W;
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.S;
    }

    public w2.a getSuggestionsAdapter() {
        return this.f1304f0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1317s0);
        post(this.f1318t0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.r0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.C, this.M);
            Rect rect = this.N;
            Rect rect2 = this.M;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.L;
            if (pVar == null) {
                p pVar2 = new p(this.N, this.M, this.C);
                this.L = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.N, this.M);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.r0, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (L()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i12 = this.f1309k0) > 0) {
                    size = Math.min(i12, size);
                }
            } else {
                size = this.f1309k0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i13 = this.f1309k0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        k0(savedState.f1325p);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1325p = L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f1308j0 || !isFocusable()) {
            return false;
        }
        if (!L()) {
            boolean requestFocus = this.C.requestFocus(i10, rect);
            if (requestFocus) {
                k0(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i10, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1316r0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1302d0 == z10) {
            return;
        }
        this.f1302d0 = z10;
        k0(z10);
        g0();
    }

    public void setImeOptions(int i10) {
        this.C.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.C.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1309k0 = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1300b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f1299a0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1301c0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1306h0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i10;
        this.f1307i0 = z10;
        w2.a aVar = this.f1304f0;
        if (aVar instanceof a1) {
            a1 a1Var = (a1) aVar;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            a1Var.x(i10);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1315q0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.f1310l0 = K;
        if (K) {
            this.C.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1305g0 = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(w2.a aVar) {
        this.f1304f0 = aVar;
        this.C.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.L);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.M = new Rect();
        this.N = new Rect();
        this.O = new int[2];
        this.P = new int[2];
        this.f1317s0 = new b();
        this.f1318t0 = new c();
        this.f1319u0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1320v0 = fVar;
        this.f1321w0 = new g();
        h hVar = new h();
        this.f1322x0 = hVar;
        i iVar = new i();
        this.f1323y0 = iVar;
        j jVar = new j();
        this.f1324z0 = jVar;
        this.A0 = new a();
        int[] iArr = g.j.f15902n2;
        g1 v10 = g1.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.p0.s0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        LayoutInflater.from(context).inflate(v10.n(g.j.f15952x2, g.g.f15809r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(g.f.D);
        this.C = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.D = findViewById(g.f.f15791z);
        View findViewById = findViewById(g.f.C);
        this.E = findViewById;
        View findViewById2 = findViewById(g.f.J);
        this.F = findViewById2;
        ImageView imageView = (ImageView) findViewById(g.f.f15789x);
        this.G = imageView;
        ImageView imageView2 = (ImageView) findViewById(g.f.A);
        this.H = imageView2;
        ImageView imageView3 = (ImageView) findViewById(g.f.f15790y);
        this.I = imageView3;
        ImageView imageView4 = (ImageView) findViewById(g.f.E);
        this.J = imageView4;
        ImageView imageView5 = (ImageView) findViewById(g.f.B);
        this.Q = imageView5;
        androidx.core.view.p0.y0(findViewById, v10.g(g.j.f15957y2));
        androidx.core.view.p0.y0(findViewById2, v10.g(g.j.C2));
        int i11 = g.j.B2;
        imageView.setImageDrawable(v10.g(i11));
        imageView2.setImageDrawable(v10.g(g.j.f15942v2));
        imageView3.setImageDrawable(v10.g(g.j.f15927s2));
        imageView4.setImageDrawable(v10.g(g.j.E2));
        imageView5.setImageDrawable(v10.g(i11));
        this.R = v10.g(g.j.A2);
        l1.a(imageView, getResources().getString(g.h.f15825n));
        this.S = v10.n(g.j.D2, g.g.f15808q);
        this.T = v10.n(g.j.f15932t2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.A0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1321w0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v10.a(g.j.f15947w2, true));
        int f10 = v10.f(g.j.f15912p2, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.W = v10.p(g.j.f15937u2);
        this.f1306h0 = v10.p(g.j.f15962z2);
        int k10 = v10.k(g.j.f15922r2, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v10.k(g.j.f15917q2, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v10.a(g.j.f15907o2, true));
        v10.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.U = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.V = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.K = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f1302d0);
        g0();
    }

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
