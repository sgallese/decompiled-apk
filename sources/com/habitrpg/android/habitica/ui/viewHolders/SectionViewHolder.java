package com.habitrpg.android.habitica.ui.viewHolders;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.AnimalExtensionsKt;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.inventory.StableSection;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import dc.w;
import qc.q;

/* compiled from: SectionViewHolder.kt */
/* loaded from: classes4.dex */
public final class SectionViewHolder extends RecyclerView.f0 {
    public static final int $stable = 8;
    private Context context;
    private final TextView countPill;
    private final TextView label;
    private final TextView notesView;
    private int selectedItem;
    private final Spinner selectionSpinner;
    private ArrayAdapter<CharSequence> spinnerAdapter;
    private pc.a<w> spinnerSelectionChanged;
    private final LinearLayout switchClassButton;
    private final CurrencyView switchClassCurrency;
    private final TextView switchClassDescription;
    private final TextView switchClassLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionViewHolder(View view) {
        super(view);
        q.i(view, "itemView");
        View findViewById = view.findViewById(R.id.label);
        q.h(findViewById, "findViewById(...)");
        this.label = (TextView) findViewById;
        Spinner spinner = (Spinner) view.findViewById(R.id.classSelectionSpinner);
        this.selectionSpinner = spinner;
        this.switchClassButton = (LinearLayout) view.findViewById(R.id.change_class_button);
        this.switchClassLabel = (TextView) view.findViewById(R.id.change_class_label);
        this.switchClassDescription = (TextView) view.findViewById(R.id.change_class_description);
        this.switchClassCurrency = (CurrencyView) view.findViewById(R.id.change_class_currency_view);
        this.notesView = (TextView) view.findViewById(R.id.headerNotesView);
        this.countPill = (TextView) view.findViewById(R.id.count_pill);
        Context context = view.getContext();
        q.h(context, "getContext(...)");
        this.context = context;
        if (spinner == null) {
            return;
        }
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.SectionViewHolder.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view2, int i10, long j10) {
                pc.a<w> spinnerSelectionChanged = SectionViewHolder.this.getSpinnerSelectionChanged();
                if (spinnerSelectionChanged != null) {
                    spinnerSelectionChanged.invoke();
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                pc.a<w> spinnerSelectionChanged = SectionViewHolder.this.getSpinnerSelectionChanged();
                if (spinnerSelectionChanged != null) {
                    spinnerSelectionChanged.invoke();
                }
            }
        });
    }

    public final void bind(String str) {
        q.i(str, "title");
        try {
            this.label.setText(this.context.getString(this.context.getResources().getIdentifier("section" + str, "string", this.context.getPackageName())));
        } catch (Exception unused) {
            this.label.setText(str);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final TextView getNotesView$Habitica_2311256681_prodRelease() {
        return this.notesView;
    }

    public final int getSelectedItem() {
        Spinner spinner = this.selectionSpinner;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    public final ArrayAdapter<CharSequence> getSpinnerAdapter() {
        return this.spinnerAdapter;
    }

    public final pc.a<w> getSpinnerSelectionChanged() {
        return this.spinnerSelectionChanged;
    }

    public final LinearLayout getSwitchClassButton() {
        return this.switchClassButton;
    }

    public final CurrencyView getSwitchClassCurrency() {
        return this.switchClassCurrency;
    }

    public final TextView getSwitchClassDescription() {
        return this.switchClassDescription;
    }

    public final TextView getSwitchClassLabel() {
        return this.switchClassLabel;
    }

    public final void setContext(Context context) {
        q.i(context, "<set-?>");
        this.context = context;
    }

    public final void setSelectedItem(int i10) {
        this.selectedItem = i10;
        Spinner spinner = this.selectionSpinner;
        if (spinner != null) {
            spinner.setSelection(i10);
        }
    }

    public final void setSpinnerAdapter(ArrayAdapter<CharSequence> arrayAdapter) {
        int i10;
        this.spinnerAdapter = arrayAdapter;
        Spinner spinner = this.selectionSpinner;
        if (spinner != null) {
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        }
        Spinner spinner2 = this.selectionSpinner;
        if (spinner2 != null) {
            if (arrayAdapter != null) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            spinner2.setVisibility(i10);
        }
    }

    public final void setSpinnerSelectionChanged(pc.a<w> aVar) {
        this.spinnerSelectionChanged = aVar;
    }

    public final void bind(StableSection stableSection) {
        String string;
        q.i(stableSection, "section");
        TextView textView = this.label;
        if (q.d(stableSection.getType(), "pets")) {
            Context context = this.context;
            string = context.getString(R.string.pet_category, AnimalExtensionsKt.getTranslatedAnimalType(context, stableSection.getKey()));
        } else {
            Context context2 = this.context;
            string = context2.getString(R.string.mount_category, AnimalExtensionsKt.getTranslatedAnimalType(context2, stableSection.getKey()));
        }
        textView.setText(string);
        if (q.d(stableSection.getKey(), "special")) {
            TextView textView2 = this.countPill;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            TextView textView3 = this.countPill;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        this.label.setGravity(8388611);
        TextView textView4 = this.countPill;
        if (textView4 == null) {
            return;
        }
        textView4.setText(this.itemView.getContext().getString(R.string.pet_ownership_fraction, Integer.valueOf(stableSection.getOwnedCount()), Integer.valueOf(stableSection.getTotalCount())));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SectionViewHolder(ViewGroup viewGroup) {
        this(ViewGroupExt.inflate$default(viewGroup, R.layout.customization_section_header, false, 2, null));
        q.i(viewGroup, "parent");
    }
}
