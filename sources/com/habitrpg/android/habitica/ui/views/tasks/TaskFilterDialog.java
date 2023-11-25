package com.habitrpg.android.habitica.ui.views.tasks;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.button.MaterialButton;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.databinding.DialogTaskFilterBinding;
import com.habitrpg.android.habitica.databinding.EditTagItemBinding;
import com.habitrpg.android.habitica.extensions.OnChangeTextWatcher;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaBottomSheetDialog;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import ec.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import qc.q;
import yc.v;

/* compiled from: TaskFilterDialog.kt */
/* loaded from: classes4.dex */
public final class TaskFilterDialog extends HabiticaBottomSheetDialog {
    public static final int $stable = 8;
    private final Drawable addIcon;
    private final DialogTaskFilterBinding binding;
    private final HashMap<String, Tag> createdTags;
    private final ArrayList<String> deletedTags;
    private final HashMap<String, Tag> editedTags;
    private boolean isEditingTags;
    private final TagRepository repository;
    private final boolean showTags;
    private List<Tag> tags;
    private TaskType taskType;
    public TasksViewModel viewModel;

    /* compiled from: TaskFilterDialog.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                iArr[TaskType.HABIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskType.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskType.TODO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaskType.REWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFilterDialog(Context context, TagRepository tagRepository, boolean z10) {
        super(context);
        q.i(context, "context");
        q.i(tagRepository, "repository");
        this.repository = tagRepository;
        this.showTags = z10;
        DialogTaskFilterBinding inflate = DialogTaskFilterBinding.inflate(getLayoutInflater());
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.taskType = TaskType.HABIT;
        this.tags = new ArrayList();
        this.editedTags = new HashMap<>();
        this.createdTags = new HashMap<>();
        this.deletedTags = new ArrayList<>();
        this.addIcon = androidx.core.content.a.e(context, R.drawable.ic_add_purple_300_36dp);
        setTitle(R.string.filters);
        LinearLayout root = inflate.getRoot();
        q.h(root, "getRoot(...)");
        setContentView(root);
        inflate.allTaskFilter.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskFilterDialog._init_$lambda$0(TaskFilterDialog.this, view);
            }
        });
        inflate.secondTaskFilter.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskFilterDialog._init_$lambda$1(TaskFilterDialog.this, view);
            }
        });
        inflate.thirdTaskFilter.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskFilterDialog._init_$lambda$2(TaskFilterDialog.this, view);
            }
        });
        inflate.clearButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskFilterDialog._init_$lambda$3(TaskFilterDialog.this, view);
            }
        });
        if (z10) {
            inflate.tagEditButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TaskFilterDialog._init_$lambda$4(TaskFilterDialog.this, view);
                }
            });
            return;
        }
        LinearLayout linearLayout = inflate.tagsList;
        q.h(linearLayout, "tagsList");
        linearLayout.setVisibility(8);
        TextView textView = inflate.tagsTitle;
        q.h(textView, "tagsTitle");
        textView.setVisibility(8);
        Button button = inflate.tagEditButton;
        q.h(button, "tagEditButton");
        button.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TaskFilterDialog taskFilterDialog, View view) {
        q.i(taskFilterDialog, "this$0");
        RadioGroup radioGroup = taskFilterDialog.binding.taskFilterWrapper;
        q.h(radioGroup, "taskFilterWrapper");
        taskFilterDialog.onCheckedChanged(radioGroup, taskFilterDialog.binding.taskFilterWrapper.getCheckedRadioButtonId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TaskFilterDialog taskFilterDialog, View view) {
        q.i(taskFilterDialog, "this$0");
        RadioGroup radioGroup = taskFilterDialog.binding.taskFilterWrapper;
        q.h(radioGroup, "taskFilterWrapper");
        taskFilterDialog.onCheckedChanged(radioGroup, taskFilterDialog.binding.taskFilterWrapper.getCheckedRadioButtonId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(TaskFilterDialog taskFilterDialog, View view) {
        q.i(taskFilterDialog, "this$0");
        RadioGroup radioGroup = taskFilterDialog.binding.taskFilterWrapper;
        q.h(radioGroup, "taskFilterWrapper");
        taskFilterDialog.onCheckedChanged(radioGroup, taskFilterDialog.binding.taskFilterWrapper.getCheckedRadioButtonId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(TaskFilterDialog taskFilterDialog, View view) {
        q.i(taskFilterDialog, "this$0");
        if (taskFilterDialog.isEditingTags) {
            taskFilterDialog.stopEditing();
        }
        taskFilterDialog.setActiveFilter(null);
        taskFilterDialog.setActiveTags(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(TaskFilterDialog taskFilterDialog, View view) {
        q.i(taskFilterDialog, "this$0");
        taskFilterDialog.editButtonClicked();
    }

    private final void createAddTagButton() {
        MaterialButton materialButton = new MaterialButton(getContext());
        materialButton.setText(R.string.add_tag);
        materialButton.setIcon(this.addIcon);
        Context context = getContext();
        q.h(context, "getContext(...)");
        materialButton.setIconTint(ColorStateList.valueOf(ContextExtensionsKt.getThemeColor(context, R.attr.colorAccent)));
        materialButton.setIconGravity(1);
        materialButton.setElevation(0.0f);
        materialButton.setBackgroundTintList(ColorStateList.valueOf(androidx.core.content.a.c(getContext(), R.color.gray700_gray10)));
        materialButton.setStrokeColorResource(R.color.content_background);
        materialButton.setStrokeWidth(0);
        materialButton.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_secondary));
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskFilterDialog.createAddTagButton$lambda$6(TaskFilterDialog.this, view);
            }
        });
        this.binding.tagsList.addView(materialButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAddTagButton$lambda$6(TaskFilterDialog taskFilterDialog, View view) {
        q.i(taskFilterDialog, "this$0");
        taskFilterDialog.createTag();
    }

    private final void createTag() {
        Tag tag = new Tag();
        String uuid = UUID.randomUUID().toString();
        q.h(uuid, "toString(...)");
        tag.setId(uuid);
        this.tags.add(tag);
        this.createdTags.put(tag.getId(), tag);
        startEditing();
    }

    private final void createTagEditView(LayoutInflater layoutInflater, int i10, final Tag tag) {
        boolean u10;
        u10 = v.u(tag.getId());
        if (u10) {
            TextView textView = new TextView(getContext());
            textView.setText(tag.getName());
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_secondary));
            this.binding.tagsList.addView(textView);
        } else if (tag.getGroup() != null) {
            EditTagItemBinding inflate = EditTagItemBinding.inflate(layoutInflater, this.binding.tagsList, false);
            q.h(inflate, "inflate(...)");
            inflate.editText.setText(tag.getName());
            inflate.editText.setEnabled(false);
            inflate.editText.setTextColor(androidx.core.content.a.c(getContext(), R.color.disabled_background));
            inflate.deleteButton.setEnabled(false);
            inflate.deleteButton.setAlpha(0.5f);
            this.binding.tagsList.addView(inflate.getRoot());
        } else {
            final EditTagItemBinding inflate2 = EditTagItemBinding.inflate(layoutInflater, this.binding.tagsList, false);
            q.h(inflate2, "inflate(...)");
            inflate2.editText.setText(tag.getName());
            inflate2.editText.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_secondary));
            inflate2.editText.addTextChangedListener(new OnChangeTextWatcher(new TaskFilterDialog$createTagEditView$1(i10, this)));
            inflate2.deleteButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TaskFilterDialog.createTagEditView$lambda$8(TaskFilterDialog.this, tag, inflate2, view);
                }
            });
            this.binding.tagsList.addView(inflate2.getRoot());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTagEditView$lambda$8(TaskFilterDialog taskFilterDialog, Tag tag, EditTagItemBinding editTagItemBinding, View view) {
        q.i(taskFilterDialog, "this$0");
        q.i(tag, "$tag");
        q.i(editTagItemBinding, "$editBinding");
        taskFilterDialog.deletedTags.add(tag.getId());
        if (taskFilterDialog.createdTags.containsKey(tag.getId())) {
            taskFilterDialog.createdTags.remove(tag.getId());
        }
        if (taskFilterDialog.editedTags.containsKey(tag.getId())) {
            taskFilterDialog.editedTags.remove(tag.getId());
        }
        taskFilterDialog.getViewModel().getTags().remove(tag.getId());
        taskFilterDialog.tags.remove(tag);
        taskFilterDialog.binding.tagsList.removeView(editTagItemBinding.getRoot());
    }

    private final void createTagEditViews() {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.tags.size();
        for (int i10 = 0; i10 < size; i10++) {
            Tag tag = this.tags.get(i10);
            q.f(from);
            createTagEditView(from, i10, tag);
        }
        createAddTagButton();
    }

    private final void createTagViews() {
        boolean u10;
        this.binding.tagsList.removeAllViews();
        Context context = getContext();
        q.h(context, "getContext(...)");
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{-3355444, ContextExtensionsKt.getThemeColor(context, R.attr.colorAccent)});
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics());
        sortTagPositions();
        for (final Tag tag : this.tags) {
            u10 = v.u(tag.getId());
            if (u10) {
                TextView textView = new TextView(getContext());
                textView.setPadding(0, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
                textView.setText(tag.getName());
                Context context2 = getContext();
                q.h(context2, "getContext(...)");
                textView.setTextColor(ContextExtensionsKt.getThemeColor(context2, R.attr.textColorTintedPrimary));
                this.binding.tagsList.addView(textView);
            } else {
                androidx.appcompat.widget.f fVar = new androidx.appcompat.widget.f(getContext());
                fVar.setText(tag.getName());
                fVar.setTextSize(2, 16.0f);
                fVar.setChecked(getViewModel().getTags().contains(tag.getId()));
                fVar.setPadding(fVar.getPaddingLeft() + applyDimension, applyDimension2, fVar.getPaddingRight(), applyDimension2);
                fVar.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_secondary));
                androidx.core.widget.c.d(fVar, colorStateList);
                fVar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.b
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                        TaskFilterDialog.createTagViews$lambda$5(TaskFilterDialog.this, tag, compoundButton, z10);
                    }
                });
                this.binding.tagsList.addView(fVar);
            }
        }
        createAddTagButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTagViews$lambda$5(TaskFilterDialog taskFilterDialog, Tag tag, CompoundButton compoundButton, boolean z10) {
        q.i(taskFilterDialog, "this$0");
        q.i(tag, "$tag");
        if (z10) {
            taskFilterDialog.getViewModel().addActiveTag(tag.getId());
        } else {
            taskFilterDialog.getViewModel().removeActiveTag(tag.getId());
        }
        taskFilterDialog.filtersChanged();
    }

    private final void editButtonClicked() {
        boolean z10 = !this.isEditingTags;
        this.isEditingTags = z10;
        if (z10) {
            startEditing();
        } else {
            stopEditing();
        }
    }

    private final void filtersChanged() {
        int c10;
        this.binding.clearButton.setEnabled(getViewModel().isFiltering(this.taskType));
        Button button = this.binding.clearButton;
        if (button.isEnabled()) {
            Context context = getContext();
            q.h(context, "getContext(...)");
            c10 = ContextExtensionsKt.getThemeColor(context, R.attr.colorAccent);
        } else {
            c10 = androidx.core.content.a.c(getContext(), R.color.text_dimmed);
        }
        button.setTextColor(c10);
    }

    private final int indexForId(String str) {
        int size = this.tags.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (q.d(str, this.tags.get(i10).getId())) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5.taskType != com.habitrpg.shared.habitica.models.tasks.TaskType.TODO) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onCheckedChanged(android.widget.RadioGroup r6, int r7) {
        /*
            r5 = this;
            r6 = 2131297440(0x7f0904a0, float:1.8212825E38)
            java.lang.String r0 = "active"
            r1 = 3
            r2 = 2
            r3 = 1
            java.lang.String r4 = "all"
            if (r7 == r6) goto L32
            r6 = 2131297654(0x7f090576, float:1.821326E38)
            if (r7 == r6) goto L18
            com.habitrpg.shared.habitica.models.tasks.TaskType r6 = r5.taskType
            com.habitrpg.shared.habitica.models.tasks.TaskType r7 = com.habitrpg.shared.habitica.models.tasks.TaskType.TODO
            if (r6 == r7) goto L49
            goto L42
        L18:
            com.habitrpg.shared.habitica.models.tasks.TaskType r6 = r5.taskType
            int[] r7 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r7[r6]
            if (r6 == r3) goto L2f
            if (r6 == r2) goto L2c
            if (r6 == r1) goto L29
            goto L42
        L29:
            java.lang.String r0 = "completed"
            goto L49
        L2c:
            java.lang.String r0 = "gray"
            goto L49
        L2f:
            java.lang.String r0 = "strong"
            goto L49
        L32:
            com.habitrpg.shared.habitica.models.tasks.TaskType r6 = r5.taskType
            int[] r7 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r7[r6]
            if (r6 == r3) goto L47
            if (r6 == r2) goto L49
            if (r6 == r1) goto L44
        L42:
            r0 = r4
            goto L49
        L44:
            java.lang.String r0 = "dated"
            goto L49
        L47:
            java.lang.String r0 = "weak"
        L49:
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel r6 = r5.getViewModel()
            com.habitrpg.shared.habitica.models.tasks.TaskType r7 = r5.taskType
            r6.setActiveFilter(r7, r0)
            r5.filtersChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.onCheckedChanged(android.widget.RadioGroup, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r5.equals(com.habitrpg.android.habitica.models.tasks.Task.FILTER_DATED) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r5.equals(com.habitrpg.android.habitica.models.tasks.Task.FILTER_WEAK) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r0 = com.habitrpg.android.habitica.R.id.second_task_filter;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r5.equals(com.habitrpg.android.habitica.models.tasks.Task.FILTER_GRAY) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r5.equals(com.habitrpg.android.habitica.models.tasks.Task.FILTER_ALL) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r5.equals(com.habitrpg.android.habitica.models.tasks.Task.FILTER_STRONG) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r5.equals(com.habitrpg.android.habitica.models.tasks.Task.FILTER_COMPLETED) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        r0 = com.habitrpg.android.habitica.R.id.third_task_filter;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        if (r4.taskType == com.habitrpg.shared.habitica.models.tasks.TaskType.DAILY) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setActiveFilter(java.lang.String r5) {
        /*
            r4 = this;
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel r0 = r4.getViewModel()
            com.habitrpg.shared.habitica.models.tasks.TaskType r1 = r4.taskType
            java.lang.String r2 = "all"
            if (r5 != 0) goto Lc
            r3 = r2
            goto Ld
        Lc:
            r3 = r5
        Ld:
            r0.setActiveFilter(r1, r3)
            r0 = 2131296384(0x7f090080, float:1.8210683E38)
            if (r5 != 0) goto L16
            goto L6e
        L16:
            int r1 = r5.hashCode()
            r3 = 2131297440(0x7f0904a0, float:1.8212825E38)
            switch(r1) {
                case -1422950650: goto L5d;
                case -1402931637: goto L50;
                case -891980137: goto L47;
                case 96673: goto L40;
                case 3181155: goto L37;
                case 3645304: goto L2a;
                case 95356534: goto L21;
                default: goto L20;
            }
        L20:
            goto L6d
        L21:
            java.lang.String r0 = "dated"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L33
            goto L6d
        L2a:
            java.lang.String r0 = "weak"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L33
            goto L6d
        L33:
            r0 = 2131297440(0x7f0904a0, float:1.8212825E38)
            goto L6e
        L37:
            java.lang.String r0 = "gray"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L59
            goto L6d
        L40:
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L6e
            goto L6d
        L47:
            java.lang.String r0 = "strong"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L59
            goto L6d
        L50:
            java.lang.String r0 = "completed"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L59
            goto L6d
        L59:
            r0 = 2131297654(0x7f090576, float:1.821326E38)
            goto L6e
        L5d:
            java.lang.String r1 = "active"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L66
            goto L6d
        L66:
            com.habitrpg.shared.habitica.models.tasks.TaskType r5 = r4.taskType
            com.habitrpg.shared.habitica.models.tasks.TaskType r1 = com.habitrpg.shared.habitica.models.tasks.TaskType.DAILY
            if (r5 != r1) goto L6e
            goto L33
        L6d:
            r0 = -1
        L6e:
            com.habitrpg.android.habitica.databinding.DialogTaskFilterBinding r5 = r4.binding
            android.widget.RadioGroup r5 = r5.taskFilterWrapper
            r5.check(r0)
            r4.filtersChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.setActiveFilter(java.lang.String):void");
    }

    private final void setActiveTags(List<String> list) {
        androidx.appcompat.widget.f fVar;
        if (list == null) {
            getViewModel().getTags().clear();
        } else {
            getViewModel().setTags(list);
        }
        int childCount = this.binding.tagsList.getChildCount() - 1;
        int i10 = 0;
        while (true) {
            androidx.appcompat.widget.f fVar2 = null;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.binding.tagsList.getChildAt(i10);
            if (childAt instanceof androidx.appcompat.widget.f) {
                fVar2 = (androidx.appcompat.widget.f) childAt;
            }
            if (fVar2 != null) {
                fVar2.setChecked(false);
            }
            i10++;
        }
        Iterator<String> it = getViewModel().getTags().iterator();
        while (it.hasNext()) {
            int indexForId = indexForId(it.next());
            if (indexForId >= 0) {
                View childAt2 = this.binding.tagsList.getChildAt(indexForId);
                if (childAt2 instanceof androidx.appcompat.widget.f) {
                    fVar = (androidx.appcompat.widget.f) childAt2;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    fVar.setChecked(true);
                }
            }
        }
        filtersChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTags(List<? extends Tag> list) {
        List<Tag> F0;
        F0 = b0.F0(this.repository.getUnmanagedCopy(list));
        this.tags = F0;
        createTagViews();
    }

    private final void sortTagPositions() {
        boolean z10;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String string = getContext().getString(R.string.challenge_tags);
        q.h(string, "getString(...)");
        String string2 = getContext().getString(R.string.group_tags);
        q.h(string2, "getString(...)");
        String string3 = getContext().getString(R.string.your_tags);
        q.h(string3, "getString(...)");
        for (Tag tag : this.tags) {
            if (!q.d(tag.getName(), string) && !q.d(tag.getName(), string2) && !q.d(tag.getName(), string3)) {
                if (tag.getChallenge$Habitica_2311256681_prodRelease()) {
                    arrayList2.add(tag);
                } else if (tag.getGroup() != null) {
                    arrayList3.add(tag);
                } else {
                    arrayList4.add(tag);
                }
            }
        }
        Tag tag2 = new Tag();
        tag2.setName(string);
        Tag tag3 = new Tag();
        tag3.setName(string2);
        Tag tag4 = new Tag();
        tag4.setName(string3);
        boolean z12 = true;
        if ((!arrayList2.isEmpty()) != false) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (q.d(((Tag) it.next()).getName(), string)) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11) {
                arrayList.add(tag2);
                arrayList.addAll(arrayList2);
            }
        }
        if ((!arrayList3.isEmpty()) != false) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (q.d(((Tag) it2.next()).getName(), string2)) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                arrayList.add(tag3);
                arrayList.addAll(arrayList3);
            }
        }
        if ((!arrayList4.isEmpty()) != false) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (q.d(((Tag) it3.next()).getName(), string3)) {
                        z12 = false;
                        break;
                    }
                }
            }
            if (z12) {
                arrayList.add(tag4);
                arrayList.addAll(arrayList4);
            }
        }
        this.tags = arrayList;
    }

    private final void startEditing() {
        this.isEditingTags = true;
        this.binding.tagsList.removeAllViews();
        createTagEditViews();
        this.binding.tagEditButton.setText(R.string.done);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
    }

    private final void stopEditing() {
        Set H0;
        boolean u10;
        setActiveTags(null);
        Collection<Tag> values = this.createdTags.values();
        q.h(values, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            u10 = v.u(((Tag) obj).getName());
            if (u10) {
                arrayList.add(obj);
            }
        }
        Collection<Tag> values2 = this.createdTags.values();
        H0 = b0.H0(arrayList);
        values2.removeAll(H0);
        this.tags.removeAll(arrayList);
        this.isEditingTags = false;
        this.binding.tagsList.removeAllViews();
        createTagViews();
        this.binding.tagEditButton.setText(R.string.edit_tag_btn_edit);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(2);
        }
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new TaskFilterDialog$stopEditing$1(this, null), 1, null);
    }

    public final TaskType getTaskType() {
        return this.taskType;
    }

    public final TasksViewModel getViewModel() {
        TasksViewModel tasksViewModel = this.viewModel;
        if (tasksViewModel != null) {
            return tasksViewModel;
        }
        q.z("viewModel");
        return null;
    }

    public final void setTaskType(TaskType taskType) {
        q.i(taskType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.taskType = taskType;
        int i10 = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.binding.taskTypeTitle.setText(R.string.todos);
                    this.binding.allTaskFilter.setText(R.string.active);
                    this.binding.secondTaskFilter.setText(R.string.dated);
                    this.binding.thirdTaskFilter.setText(R.string.completed);
                }
            } else {
                this.binding.taskTypeTitle.setText(R.string.dailies);
                this.binding.allTaskFilter.setText(R.string.all);
                this.binding.secondTaskFilter.setText(R.string.due);
                this.binding.thirdTaskFilter.setText(R.string.gray);
            }
        } else {
            this.binding.taskTypeTitle.setText(R.string.habits);
            this.binding.allTaskFilter.setText(R.string.all);
            this.binding.secondTaskFilter.setText(R.string.weak);
            this.binding.thirdTaskFilter.setText(R.string.strong);
        }
        setActiveFilter(getViewModel().getActiveFilter(taskType));
    }

    public final void setViewModel(TasksViewModel tasksViewModel) {
        q.i(tasksViewModel, "<set-?>");
        this.viewModel = tasksViewModel;
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.showTags) {
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new TaskFilterDialog$show$1(this, null), 1, null);
        }
        super.show();
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131080);
        }
    }
}
