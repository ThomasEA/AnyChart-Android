package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class UiColorRange extends JsObject {

    
    private EnumsAlign align;
    private String align1;

    public void setAlign(EnumsAlign align) {
        this.align = null;
        this.align1 = null;
        
        this.align = align;
    }


    public void setAlign(String align1) {
        this.align = null;
        this.align1 = null;
        
        this.align1 = align1;
    }

    private Double colorLineSize;

    public void setColorlinesize(Double colorLineSize) {
        this.colorLineSize = colorLineSize;
    }

    private Boolean drawFirstLabel;

    public void setDrawfirstlabel(Boolean drawFirstLabel) {
        this.drawFirstLabel = drawFirstLabel;
    }

    private Boolean drawLastLabel;

    public void setDrawlastlabel(Boolean drawLastLabel) {
        this.drawLastLabel = drawLastLabel;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Boolean labels;

    public void setLabels(Boolean labels) {
        this.labels = labels;
    }

    private String length;
    private Double length1;

    public void setLength(String length) {
        this.length = null;
        this.length1 = null;
        
        this.length = length;
    }


    public void setLength(Double length1) {
        this.length = null;
        this.length1 = null;
        
        this.length1 = length1;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private UiMarkersfactoryMarker marker;

    public void setMarker(UiMarkersfactoryMarker marker) {
        this.marker = marker;
    }

    private Boolean minorLabels;

    public void setMinorlabels(Boolean minorLabels) {
        this.minorLabels = minorLabels;
    }

    private Boolean minorTicks;

    public void setMinorticks(Boolean minorTicks) {
        this.minorTicks = minorTicks;
    }

    private String orientation;
    private Orientation orientation1;

    public void setOrientation(String orientation) {
        this.orientation = null;
        this.orientation1 = null;
        
        this.orientation = orientation;
    }


    public void setOrientation(Orientation orientation1) {
        this.orientation = null;
        this.orientation1 = null;
        
        this.orientation1 = orientation1;
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;

    public void setOverlapmode(LabelsOverlapMode overlapMode) {
        this.overlapMode = null;
        this.overlapMode1 = null;
        
        this.overlapMode = overlapMode;
    }


    public void setOverlapmode(String overlapMode1) {
        this.overlapMode = null;
        this.overlapMode1 = null;
        
        this.overlapMode1 = overlapMode1;
    }

    private PaperSize paperSizeOrOptions;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private ScalesBase scale;

    public void setScale(ScalesBase scale) {
        this.scale = scale;
    }

    private Double staggerLines;

    public void setStaggerlines(Double staggerLines) {
        this.staggerLines = staggerLines;
    }

    private Double staggerMaxLines;

    public void setStaggermaxlines(Double staggerMaxLines) {
        this.staggerMaxLines = staggerMaxLines;
    }

    private Boolean staggerMode;

    public void setStaggermode(Boolean staggerMode) {
        this.staggerMode = staggerMode;
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setStroke(Stroke stroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        
        this.stroke = stroke;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setStroke(ColoredFill stroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        
        this.stroke1 = stroke1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setStroke(String stroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        
        this.stroke2 = stroke2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }

    private Boolean ticks;

    public void setTicks(Boolean ticks) {
        this.ticks = ticks;
    }

    private Boolean title;
    private String title1;

    public void setTitle(Boolean title) {
        this.title = null;
        this.title1 = null;
        
        this.title = title;
    }


    public void setTitle(String title1) {
        this.title = null;
        this.title1 = null;
        
        this.title1 = title1;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private Double width;
    private String width1;

    public void setWidth(Double width) {
        this.width = null;
        this.width1 = null;
        
        this.width = width;
    }


    public void setWidth(String width1) {
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSalign() {
        if (align != null) {
            return String.format(Locale.US, "align: %s,", (align != null) ? align.generateJs() : "null");
        }
        return "";
    }

    private String generateJSalign1() {
        if (align1 != null) {
            return String.format(Locale.US, "align: %s,", align1);
        }
        return "";
    }

    private String generateJScolorLineSize() {
        if (colorLineSize != null) {
            return String.format(Locale.US, "colorLineSize: %f,", colorLineSize);
        }
        return "";
    }

    private String generateJSdrawFirstLabel() {
        if (drawFirstLabel != null) {
            return String.format(Locale.US, "drawFirstLabel: %b,", drawFirstLabel);
        }
        return "";
    }

    private String generateJSdrawLastLabel() {
        if (drawLastLabel != null) {
            return String.format(Locale.US, "drawLastLabel: %b,", drawLastLabel);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSlabels() {
        if (labels != null) {
            return String.format(Locale.US, "labels: %b,", labels);
        }
        return "";
    }

    private String generateJSlength() {
        if (length != null) {
            return String.format(Locale.US, "length: %s,", length);
        }
        return "";
    }

    private String generateJSlength1() {
        if (length1 != null) {
            return String.format(Locale.US, "length: %f,", length1);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSmarker() {
        if (marker != null) {
            return String.format(Locale.US, "marker: %s,", (marker != null) ? marker.generateJs() : "null");
        }
        return "";
    }

    private String generateJSminorLabels() {
        if (minorLabels != null) {
            return String.format(Locale.US, "minorLabels: %b,", minorLabels);
        }
        return "";
    }

    private String generateJSminorTicks() {
        if (minorTicks != null) {
            return String.format(Locale.US, "minorTicks: %b,", minorTicks);
        }
        return "";
    }

    private String generateJSorientation() {
        if (orientation != null) {
            return String.format(Locale.US, "orientation: %s,", orientation);
        }
        return "";
    }

    private String generateJSorientation1() {
        if (orientation1 != null) {
            return String.format(Locale.US, "orientation: %s,", (orientation1 != null) ? orientation1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSoverlapMode() {
        if (overlapMode != null) {
            return String.format(Locale.US, "overlapMode: %s,", (overlapMode != null) ? overlapMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSoverlapMode1() {
        if (overlapMode1 != null) {
            return String.format(Locale.US, "overlapMode: %s,", overlapMode1);
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %s,", (scale != null) ? scale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstaggerLines() {
        if (staggerLines != null) {
            return String.format(Locale.US, "staggerLines: %f,", staggerLines);
        }
        return "";
    }

    private String generateJSstaggerMaxLines() {
        if (staggerMaxLines != null) {
            return String.format(Locale.US, "staggerMaxLines: %f,", staggerMaxLines);
        }
        return "";
    }

    private String generateJSstaggerMode() {
        if (staggerMode != null) {
            return String.format(Locale.US, "staggerMode: %b,", staggerMode);
        }
        return "";
    }

    private String generateJSstroke() {
        if (stroke != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke != null) ? stroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke1() {
        if (stroke1 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke1 != null) ? stroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke2() {
        if (stroke2 != null) {
            return String.format(Locale.US, "stroke: %s,", stroke2);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %b,", ticks);
        }
        return "";
    }

    private String generateJStitle() {
        if (title != null) {
            return String.format(Locale.US, "title: %b,", title);
        }
        return "";
    }

    private String generateJStitle1() {
        if (title1 != null) {
            return String.format(Locale.US, "title: %s,", title1);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSalign());
        js.append(generateJSalign1());
        js.append(generateJScolorLineSize());
        js.append(generateJSdrawFirstLabel());
        js.append(generateJSdrawLastLabel());
        js.append(generateJSenabled());
        js.append(generateJSlabels());
        js.append(generateJSlength());
        js.append(generateJSlength1());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSmarker());
        js.append(generateJSminorLabels());
        js.append(generateJSminorTicks());
        js.append(generateJSorientation());
        js.append(generateJSorientation1());
        js.append(generateJSoverlapMode());
        js.append(generateJSoverlapMode1());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJSscale());
        js.append(generateJSstaggerLines());
        js.append(generateJSstaggerMaxLines());
        js.append(generateJSstaggerMode());
        js.append(generateJSstroke());
        js.append(generateJSstroke1());
        js.append(generateJSstroke2());
        js.append(generateJSthickness());
        js.append(generateJSdashpattern());
        js.append(generateJSlineJoin());
        js.append(generateJSlineCap());
        js.append(generateJSticks());
        js.append(generateJStitle());
        js.append(generateJStitle1());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSwidth());
        js.append(generateJSwidth1());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}