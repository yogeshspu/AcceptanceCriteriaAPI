import java.util.ArrayList;

public class AcceptanceAPI {
 private float CategoryId;
 private String Name;
 private String Path;
 private boolean CanListAuctions;
 private boolean CanListClassifieds;
 private boolean CanRelist;
 private String LegalNotice;
 private float DefaultDuration;
 ArrayList < Object > AllowedDurations = new ArrayList < Object > ();
 Fees FeesObject;
 private float FreePhotoCount;
 private float MaximumPhotoCount;
 private boolean IsFreeToRelist;
 ArrayList < Object > Promotions = new ArrayList < Object > ();
 ArrayList < Object > EmbeddedContentOptions = new ArrayList < Object > ();
 private float MaximumTitleLength;
 private float AreaOfBusiness;
 private float DefaultRelistDuration;


 // Getter Methods 

 public float getCategoryId() {
  return CategoryId;
 }

 public String getName() {
  return Name;
 }

 public String getPath() {
  return Path;
 }

 public boolean getCanListAuctions() {
  return CanListAuctions;
 }

 public boolean getCanListClassifieds() {
  return CanListClassifieds;
 }

 public boolean getCanRelist() {
  return CanRelist;
 }

 public String getLegalNotice() {
  return LegalNotice;
 }

 public float getDefaultDuration() {
  return DefaultDuration;
 }

 public Fees getFees() {
  return FeesObject;
 }

 public float getFreePhotoCount() {
  return FreePhotoCount;
 }

 public float getMaximumPhotoCount() {
  return MaximumPhotoCount;
 }

 public boolean getIsFreeToRelist() {
  return IsFreeToRelist;
 }

 public float getMaximumTitleLength() {
  return MaximumTitleLength;
 }

 public float getAreaOfBusiness() {
  return AreaOfBusiness;
 }

 public float getDefaultRelistDuration() {
  return DefaultRelistDuration;
 }

 // Setter Methods 

 public void setCategoryId(float CategoryId) {
  this.CategoryId = CategoryId;
 }

 public void setName(String Name) {
  this.Name = Name;
 }

 public void setPath(String Path) {
  this.Path = Path;
 }

 public void setCanListAuctions(boolean CanListAuctions) {
  this.CanListAuctions = CanListAuctions;
 }

 public void setCanListClassifieds(boolean CanListClassifieds) {
  this.CanListClassifieds = CanListClassifieds;
 }

 public void setCanRelist(boolean CanRelist) {
  this.CanRelist = CanRelist;
 }

 public void setLegalNotice(String LegalNotice) {
  this.LegalNotice = LegalNotice;
 }

 public void setDefaultDuration(float DefaultDuration) {
  this.DefaultDuration = DefaultDuration;
 }

 public void setFees(Fees FeesObject) {
  this.FeesObject = FeesObject;
 }

 public void setFreePhotoCount(float FreePhotoCount) {
  this.FreePhotoCount = FreePhotoCount;
 }

 public void setMaximumPhotoCount(float MaximumPhotoCount) {
  this.MaximumPhotoCount = MaximumPhotoCount;
 }

 public void setIsFreeToRelist(boolean IsFreeToRelist) {
  this.IsFreeToRelist = IsFreeToRelist;
 }

 public void setMaximumTitleLength(float MaximumTitleLength) {
  this.MaximumTitleLength = MaximumTitleLength;
 }

 public void setAreaOfBusiness(float AreaOfBusiness) {
  this.AreaOfBusiness = AreaOfBusiness;
 }

 public void setDefaultRelistDuration(float DefaultRelistDuration) {
  this.DefaultRelistDuration = DefaultRelistDuration;
 }
}
