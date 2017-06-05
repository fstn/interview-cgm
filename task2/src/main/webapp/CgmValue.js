/**
 * Part B
 *
 * This is a simple value object.
 *
 * @param {string} name The name of the value object
 * @param {*} initialValue The initial value of the value object
 *
 * @todo Optimize the code below, dont change the signatures or the bevaiour
 * @todo Improve the setters to ensure that only a boolean value will be stored
 *       in the private attributes.(false, 0, null, undefined to be false)
 *
 *       Alternativly you can ensure that only true will be stored directly any
 *       other value should be false.
 *
 * @bonus Explain how we return an anonymous object. What are the pros and cons?
 */
// function CgmValue (name, initialValue) {
//   var _enabled = false;
//   var _visible = false;
//
//   var _name = name;
//   var _value = initialValue;
//
//   return {
//     getName: function () {
//       return _enabled === true && _visible === true ? _name : null;
//     },
//     getValue: function () {
//       return _enabled === true && _visible === true ? _value : null;
//     },
//     setEnabled: function (enabled) {
//       _enabled = enabled;
//     },
//     setVisible: function (visible) {
//       _visible = visible;
//     }
//   };
// }
function CgmValue (name, initialValue) {
  CgmValueClass = function (name, initialValue) {
    this._enabled = false;
    this._visible = false;

    this._name = name;
    this._value = initialValue;
  };

  CgmValueClass.prototype.getName = function () {
    return this._enabled === true && this._visible === true ? this._name : null;
  };
  CgmValueClass.prototype.getValue = function () {
    return this._enabled === true && this._visible === true ? this._value : null;
  };
  CgmValueClass.prototype.setEnabled = function (enabled) {
    this._enabled = getBoolean(enabled);
  };
  CgmValueClass.prototype.setVisible = function (visible) {
    this._visible = getBoolean(visible);
  };

  function getBoolean(value){
    return  value === true ? true:false;
  }

  return new CgmValueClass(name, initialValue);
}